package com.bank.service;

import com.bank.model.Account;

//Interface can extends another interface
public interface BankService  {
    void createAccount();
    void depositMoney();
    void withdrawMoney();
    Account showAccountDetails();
    void showAllAccounts();
    void getTransactions(int page);
}
