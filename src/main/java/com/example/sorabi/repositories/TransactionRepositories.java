package com.example.sorabi.repositories;

import com.example.sorabi.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepositories extends JpaRepository<Transaction, Long> {

}
