package com.example.sorabi.services;

import com.example.sorabi.models.Transaction;
import com.example.sorabi.repositories.TransactionRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServices {
    @Autowired
    TransactionRepositories transactionRepositories;

    public List<Transaction> allTransaction(){
        List<Transaction> transaction = new ArrayList<Transaction>();
        transactionRepositories.findAll().forEach(list -> transaction.add(list));
        return transaction;
    }

    public void create(Transaction transaction){
        transactionRepositories.save(transaction);
    }

}
