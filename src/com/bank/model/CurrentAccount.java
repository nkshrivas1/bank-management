package com.bank.model;

import com.bank.constant.AccountType;

public class CurrentAccount extends Account{
    private static final double MAX_BALANCE = 1000000.0;
    public CurrentAccount(User user, double balance) {
        super(user, balance, AccountType.CURRENT);
    }
    public double getMaxBalance(){
        return MAX_BALANCE;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", user=" + user +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }
}
