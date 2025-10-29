package com.security.demo.controller;

import com.security.demo.model.Details;
import com.security.demo.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DetailsService service;

   @GetMapping("/getAll")
    public List<Details> getAllList(){
       return service.getAllDetails();
   }

   @GetMapping("/getByID")
    public Details getById(@RequestParam Long id){
       return service.getDatabyId(id);
   }

   @PostMapping("/addData")
    public Details addData(Details details){
       return service.AddUser(details);
   }





}
