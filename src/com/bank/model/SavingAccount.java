package com.bank.model;

import com.bank.constant.AccountType;

public class SavingAccount extends Account{
    private static final double MIN_BALANCE = 10000.0;

    @Override
    public String toString() {
        return "SavingAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", user=" + user +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }

    public SavingAccount(User user, double balance) {
        super(user, balance, AccountType.SAVING);
    }
    public double getMinBalance(){
        return MIN_BALANCE;
    }
}
