package com.geekster.Ecommerce.API.repo;

import com.geekster.Ecommerce.API.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
