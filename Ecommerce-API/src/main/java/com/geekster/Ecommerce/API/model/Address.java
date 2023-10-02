package com.geekster.Ecommerce.API.model;


import jakarta.persistence.*;


@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String landmark;
    private String phoneNumber;
    private String zipCode;
    private String state;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    User user;

    public Address(Integer id, String name, String landmark, String phoneNumber, String zipCode, String state) {
        this.id = id;
        this.name = name;
        this.landmark = landmark;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
