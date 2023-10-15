package com.geekster.Basic.Instagram.App.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class AuthenticationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private String token;
    private LocalDateTime tokenCreationDate;

    @OneToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

    public AuthenticationToken() {
    }

    public AuthenticationToken(Long tokenId, String token, LocalDateTime tokenCreationDate, User user) {
        this.tokenId = tokenId;
        this.token = token;
        this.tokenCreationDate = tokenCreationDate;
        this.user = user;
    }

    public AuthenticationToken(User existingUser) {
    }

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDateTime getTokenCreationDate() {
        return tokenCreationDate;
    }

    public void setTokenCreationDate(LocalDateTime tokenCreationDate) {
        this.tokenCreationDate = tokenCreationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
