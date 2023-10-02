package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.User;
import com.geekster.Ecommerce.API.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User getUserById(Integer id) {
        return userRepo.findById(id)
                .orElseThrow();
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User updateUser(Integer id, User newUser) {
        User existingUser = getUserById(id);
        existingUser.setName(newUser.getName());
        existingUser.setEmail(newUser.getEmail());
        existingUser.setPassword(newUser.getPassword());
        existingUser.setPhoneNumber(newUser.getPhoneNumber());
        return userRepo.save(existingUser);
    }

    public void deleteUser(Integer id) {
        User user = getUserById(id);
        userRepo.delete(user);
    }
}

