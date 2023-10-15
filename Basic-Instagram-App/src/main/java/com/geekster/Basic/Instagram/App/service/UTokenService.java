package com.geekster.Basic.Instagram.App.service;

import com.geekster.Basic.Instagram.App.model.AuthenticationToken;
import com.geekster.Basic.Instagram.App.repo.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UTokenService {

    @Autowired
    ITokenRepo tokenRepo;

    public void createToken(AuthenticationToken token) {
        tokenRepo.save(token);
    }
}
