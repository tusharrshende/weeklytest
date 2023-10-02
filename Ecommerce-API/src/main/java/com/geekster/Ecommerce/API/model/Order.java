package com.geekster.Ecommerce.API.model;

import jakarta.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "fk_product_id")
    Product product;

    @ManyToOne
    @JoinColumn(name = "fk_address_id")
    Address address;

    private Integer productQuantity;

    public Order(Integer id, User user, Product product, Address address, Integer productQuantity) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.address = address;
        this.productQuantity = productQuantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }
}
