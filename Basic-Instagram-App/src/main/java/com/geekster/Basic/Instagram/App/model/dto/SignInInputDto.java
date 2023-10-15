package com.geekster.Basic.Instagram.App.model.dto;

public class SignInInputDto {

    private String email;
    private String password;

    public SignInInputDto() {
    }

    public SignInInputDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
