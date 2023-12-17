package com.myProject.Model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "admins")
public class AdminModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = false, name = "username")
    private String username;

    @Column(length = 45, nullable = false, name = "email")
    private String email;

    @Column(length = 15, nullable = false, name = "password")
    private String password;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

