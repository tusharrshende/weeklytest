package com.geekster.studentmanagement.controller;

import com.geekster.studentmanagement.model.Laptop;
import com.geekster.studentmanagement.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;


        @PostMapping("laptop")
        public String addLaptop(@RequestBody Laptop newLaptop) {
            return laptopService.addLaptop(newLaptop);
        }

        @GetMapping("laptops")
        public List<Laptop> getAllLaptops() {
            return laptopService.getAllLaptops();
        }

        @PutMapping("/{id}")
        public String updateLaptop(@PathVariable Integer id, @RequestBody Laptop newLaptop) {
            return laptopService.updateLaptop(id, newLaptop);
        }

        @DeleteMapping("/{id}")
        public String deleteLaptop(@PathVariable Integer id) {
           return laptopService.deleteLaptop(id);
        }
    }

