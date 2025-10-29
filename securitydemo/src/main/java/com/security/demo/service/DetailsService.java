package com.security.demo.service;

import com.security.demo.Repo.DetailsRepository;
import com.security.demo.model.Details;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsService{

    private DetailsRepository repo;

    public List<Details> getAllDetails(){
       return repo.findAll();
    }

    public Details getDatabyId(Long id){
        return repo.findById(id).orElse(null);
    }

    public Details AddUser(Details dt){
        return repo.save(dt);
    }



}
