package com.geekster.Basic.Instagram.App.repo;

import com.geekster.Basic.Instagram.App.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Integer> {
    User findFirstByEmail(String newEmail);
}
