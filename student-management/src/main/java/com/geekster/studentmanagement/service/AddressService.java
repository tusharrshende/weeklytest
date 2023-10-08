package com.geekster.studentmanagement.service;

import com.geekster.studentmanagement.model.Address;
import com.geekster.studentmanagement.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "address added";
    }

    public List<Address> getAllAddresses() {
       return addressRepo.findAll();
    }

    public String updateAddress(Long id, Address newAddress) {
        Address address = addressRepo.findById(id).orElseThrow();
        address.setLandmark(newAddress.getLandmark());
        address.setZipcode(newAddress.getZipcode());
        address.setDistrict(newAddress.getDistrict());
        address.setState(newAddress.getState());
        address.setCountry(newAddress.getCountry());
        addressRepo.save(address);
        return "address updated";
    }

    public String deleteAddress(Long id) {
        addressRepo.deleteById(id);
        return "address deleted";
    }
}
