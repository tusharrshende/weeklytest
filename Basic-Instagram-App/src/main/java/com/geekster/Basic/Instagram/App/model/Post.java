package com.geekster.Basic.Instagram.App.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String postData;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

    public Post() {
    }

    public Post(Integer postId, LocalDateTime createdDate, LocalDateTime updatedDate, String postData, User user) {
        this.postId = postId;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.postData = postData;
        this.user = user;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getPostData() {
        return postData;
    }

    public void setPostData(String postData) {
        this.postData = postData;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
