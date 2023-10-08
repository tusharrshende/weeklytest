package com.geekster.studentmanagement.controller;

import com.geekster.studentmanagement.model.Address;
import com.geekster.studentmanagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;


        @PostMapping("address")
        public String addAddress(@RequestBody Address newAddress) {
            return addressService.addAddress(newAddress);
        }

        @GetMapping("address")
        public List<Address> getAllAddresses() {
            return addressService.getAllAddresses();
        }

        @PutMapping("/{id}")
        public String updateAddress(@PathVariable Long id, @RequestBody Address newAddress) {
            return addressService.updateAddress(id, newAddress);
        }

        @DeleteMapping("/{id}")
        public String deleteAddress(@PathVariable Long id) {
            return addressService.deleteAddress(id);
        }
    }

