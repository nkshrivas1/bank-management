package com.bank.repository;

import com.bank.model.Account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankRepository {
    // store accounts
    public static Map<String, Account> accounts = new HashMap<>();
    //store transactions
    public static Map<String,ArrayList> transactions = new HashMap<>();

    // Prevent object creation
    private BankRepository(){

    }
}
