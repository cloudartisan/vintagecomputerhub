package com.vintagecomputerhub.controller;

import com.vintagecomputerhub.model.Computer;
import com.vintagecomputerhub.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/computers")
public class ComputerController {
    @Autowired
    private ComputerService computerService;

    @PostMapping
    public ResponseEntity<Computer> addComputer(@RequestBody Computer computer) {
        Computer savedComputer = computerService.saveComputer(computer);
        return ResponseEntity.ok(savedComputer);
    }

    @GetMapping
    public List<Computer> getAllComputers() {
        return computerService.getAllComputers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Computer> getComputerById(@PathVariable Long id) {
        Computer computer = computerService.getComputerById(id);
        if (computer != null) {
            return ResponseEntity.ok(computer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComputer(@PathVariable Long id) {
        computerService.deleteComputer(id);
        return ResponseEntity.ok().build();
    }
}