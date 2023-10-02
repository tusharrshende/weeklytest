package com.geekster.Ecommerce.API.repo;

import com.geekster.Ecommerce.API.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Integer> {
}
