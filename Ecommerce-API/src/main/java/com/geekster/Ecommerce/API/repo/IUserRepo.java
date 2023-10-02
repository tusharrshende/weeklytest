package com.geekster.Ecommerce.API.repo;

import com.geekster.Ecommerce.API.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
