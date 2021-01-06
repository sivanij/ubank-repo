package com.upgrad.ubank.dtos.services;


import com.upgrad.ubank.dtos.Transaction;

public class TransactionServiceImpl implements TransactionService{

    @Override
    public Transaction createTransaction(Transaction transaction) {

        System.out.println(transaction);

        return transaction;
    }

    @Override
    public Transaction[] getTransactions(int accountNo) {
        return new Transaction[0];
    }
}
