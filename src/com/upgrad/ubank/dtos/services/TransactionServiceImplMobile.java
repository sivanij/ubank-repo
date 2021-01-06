package com.upgrad.ubank.dtos.services;

import com.upgrad.ubank.dtos.Transaction;

public class TransactionServiceImplMobile implements TransactionService {
    public Transaction[] transactions;

    public int  counter=0;
    @Override
    public Transaction createTransaction(Transaction transaction) {
        transactions=new Transaction[100];
        transactions[counter]=transaction;
        counter++;
        return transaction;
    }

    @Override
    public Transaction[] getTransactions(int accountNo) {
        for(int i=0;i< transactions.length;i++) {
//            if (){
//
//            }
        }
        return null;
    }
}

