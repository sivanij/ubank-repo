package com.upgrad.ubank.dtos.services;

import com.upgrad.ubank.dtos.Account;
import com.upgrad.ubank.dtos.Transaction;

public interface AccountService {
    boolean login (Account account);
    boolean register (Account account);
    Account getAccount (int accountNo);
    Account deposit (int accountNo, int amount);
    Account withdraw (int accountNo, int amount);
}
