package com.transaction.demo.controller;

import com.transaction.demo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @Autowired
    private TransactionService service;

    public static class TranseferRequest{
        public Long fromId;
        public Long toId;
        public double amount;
    }

    @PostMapping("/transfer")
    public String tranactiondo(@RequestBody TranseferRequest request){
        try{
            service.transfernMoney(request.fromId,request.toId,request.amount);
            return "Transfer Successful";
        }catch(Exception e){
            return "Transaction Unccessfull";
        }
    }
}
