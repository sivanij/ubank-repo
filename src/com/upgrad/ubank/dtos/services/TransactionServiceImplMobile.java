package com.upgrad.ubank.dtos.services;

import com.upgrad.ubank.dtos.Transaction;

public class TransactionServiceImplMobile implements TransactionService {
    private Transaction[] transactions;
    private int  counter;
    public TransactionServiceImplMobile(){
        transactions=new Transaction[100];
        counter=0;
    }
    @Override
    public Transaction createTransaction(Transaction transaction) {
        transactions[counter++]=transaction;
        return transaction;
    }

    @Override
    public Transaction[] getTransactions(int accountNo) {
        Transaction[] temp=new Transaction[100];
        int  counterTemp=0;
        for(int i=0;i<counter;i++) {
            if (transactions[i].getAccountNo()==accountNo){
              temp[counterTemp++]=transactions[i];
            }
        }
        return temp;
    }
}

