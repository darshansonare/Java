package com.transaction.demo.service;

import com.transaction.demo.model.Account;
import com.transaction.demo.repo.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repo;



    @Transactional(isolation= Isolation.REPEATABLE_READ)
    public void transfernMoney(Long formAccountId,Long toAccountId, double amount)
    {
        Account from=repo.findById(formAccountId).orElseThrow();
        Account to=repo.findById(toAccountId).orElseThrow();


        from.setBalance(from.getBalance()- amount);
        repo.save(from);

        to.setBalance(to.getBalance()+ amount);
        repo.save(to);
    }

}

