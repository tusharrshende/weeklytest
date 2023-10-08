package com.geekster.studentmanagement.repo;

import com.geekster.studentmanagement.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
