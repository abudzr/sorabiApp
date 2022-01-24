package com.example.sorabi.controller;

import com.example.sorabi.models.Transaction;
import com.example.sorabi.services.TransactionServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Configuration
//Controller
@RestController
@RequestMapping("/api")
@Api(tags = "Transaction")
public class TransactionController {
    @Autowired
    TransactionServices transactionServices;

    @ApiOperation("View All Products")
    @GetMapping(path="/transaction")
    public List<Transaction> allTransaction(){
        return transactionServices.allTransaction();
    }


    @ApiOperation("Create New Products")
    @PostMapping("/transaction")
    public Transaction createTransaction(@RequestBody Transaction transaction){
        transactionServices.create(transaction);
        return transaction;
    }

}