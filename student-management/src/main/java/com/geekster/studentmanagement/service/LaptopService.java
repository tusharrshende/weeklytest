package com.geekster.studentmanagement.service;

import com.geekster.studentmanagement.model.Laptop;
import com.geekster.studentmanagement.repo.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptop(Laptop newLaptop) {
        laptopRepo.save(newLaptop);
        return "laptop added";
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public String updateLaptop(Integer id, Laptop newLaptop) {
        Laptop laptop = laptopRepo.findById(id).orElseThrow();
        laptop.setName(newLaptop.getName());
        laptop.setBrand(newLaptop.getBrand());
        laptop.setPrice(newLaptop.getPrice());
        laptopRepo.save(laptop);
        return "laptop updated";
    }

    public String deleteLaptop(Integer id) {
        laptopRepo.deleteById(id);
        return "laptop deleted";
    }
}
