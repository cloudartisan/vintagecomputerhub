package com.vintagecomputerhub.repository;

import com.vintagecomputerhub.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
