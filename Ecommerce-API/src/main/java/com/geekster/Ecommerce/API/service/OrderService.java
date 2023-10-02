package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.Order;
import com.geekster.Ecommerce.API.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;

    public Order createOrder(Order order) {
        return orderRepo.save(order);
    }

    public Order getOrderById(Integer id) {
        return orderRepo.findById(id).orElseThrow();
    }

}
