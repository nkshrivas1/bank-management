package com.bank.model;

import com.bank.constant.AccountType;
import com.bank.util.IdGenerator;

public class Account {
  protected String accountNumber;
  protected User user;
  protected double balance;
  protected AccountType accountType;
  //constructors
    IdGenerator id = new IdGenerator();

    public Account(User user, double balance, AccountType accountType) {
        this.user = user;
        this.balance = balance;
        this.accountType = accountType;
        this.accountNumber = id.generateAccountNumber(accountType);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public User getUser() {
        return user;
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public String withdraw(double amount){
        if(amount>balance) return "Insuficient balance";
        balance -= amount;
        return "Successfully withdrawn";
    }
    //getters
    //deposit
    //withdraw
}
