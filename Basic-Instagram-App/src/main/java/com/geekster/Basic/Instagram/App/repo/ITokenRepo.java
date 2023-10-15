package com.geekster.Basic.Instagram.App.repo;

import com.geekster.Basic.Instagram.App.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken, Integer> {
}
