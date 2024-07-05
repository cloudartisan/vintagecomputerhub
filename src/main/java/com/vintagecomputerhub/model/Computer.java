package com.vintagecomputerhub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String manufacturer;
    private String model;
    private String name;
    private Integer year;
    private String description;
    private String condition;

    public Computer() {
    }

    public Computer(String name, String manufacturer, String model, Integer year, String description) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public String getCondition() {
        return condition;
    }
}
