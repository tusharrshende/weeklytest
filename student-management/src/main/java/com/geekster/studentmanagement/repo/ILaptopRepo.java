package com.geekster.studentmanagement.repo;

import com.geekster.studentmanagement.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Integer> {
}
