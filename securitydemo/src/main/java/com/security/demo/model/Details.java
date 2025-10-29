package com.security.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    private String password;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return role;
    }

    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
}
