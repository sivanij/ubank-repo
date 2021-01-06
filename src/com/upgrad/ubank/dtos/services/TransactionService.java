package com.upgrad.ubank.dtos.services;

import com.upgrad.ubank.dtos.Transaction;

public interface TransactionService {
    Transaction createTransaction (Transaction transaction);
    Transaction[] getTransactions (int accountNo);
}
