package com.transaction.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double amount;

    public Account(){};

    public Account(String name,double amount){
        this.name=name;
        this.amount=amount;
    }

    public Long getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setBalance(Double amount){
        this.amount=amount;
    }
    public Double getBalance(){
        return amount;
    }
}
