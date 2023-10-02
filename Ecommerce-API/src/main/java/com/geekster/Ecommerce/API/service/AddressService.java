package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.Address;
import com.geekster.Ecommerce.API.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }

    public Address getAddressById(Integer id) {
        return addressRepo.findById(id).orElseThrow();
    }

    // Implement other address-related methods as needed
}

