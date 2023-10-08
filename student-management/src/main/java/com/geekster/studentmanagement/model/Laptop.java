package com.geekster.studentmanagement.model;

import jakarta.persistence.*;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String laptopId;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne(mappedBy = "laptop")
    Student student;

    public Laptop() {
    }

    public Laptop(String laptopId, String name, String brand, Integer price, Student student) {
        this.laptopId = laptopId;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.student = student;
    }

    public String getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(String laptopId) {
        this.laptopId = laptopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
