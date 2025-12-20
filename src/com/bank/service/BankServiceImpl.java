package com.bank.service;

import com.bank.constant.AccountType;
import com.bank.exceptions.AccountNotFound;
import com.bank.model.Account;
import com.bank.model.CurrentAccount;
import com.bank.model.SavingAccount;
import com.bank.model.User;
import com.bank.repository.BankRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class BankServiceImpl implements BankService{
    Scanner sc = new Scanner(System.in);
    String name,email,address,mobileNo;
    AccountType accountType;
    double balance;

    @Override
    public void createAccount() {
        System.out.println("Enter  Details :");
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Address: ");
        address = sc.nextLine();
        System.out.println("Mobile No: ");
        mobileNo = sc.nextLine();
        System.out.println("Account Type: ");
        System.out.println("1. Savings");
        System.out.println("2. Current ");
        int accountOption = sc.nextInt();
        System.out.println("Enter balance: ");
        balance = sc.nextDouble();
        while (accountOption ==1 && balance<=10000){
            System.out.println("Balance should be greater than or equal to 10000 ");
            balance = sc.nextDouble();
        }

        if(accountOption == 1){
            accountType = AccountType.SAVING;
        }else{
            accountType = AccountType.CURRENT;
        }
        Account account;
        User user = new User(name,mobileNo,address,email);
        System.out.println(user.toString());
        if(accountType == AccountType.SAVING){
            account = new SavingAccount(user,balance);
            System.out.println(account.toString());
        }else {
            account = new CurrentAccount(user,balance);
            System.out.println(account.toString());
        }
        BankRepository.accounts.put(account.getAccountNumber(),
                account);
        String record = LocalDateTime.now() + " | " +
                " credit " + " | " + balance;
        ArrayList<String> transaction = new ArrayList<>();
        transaction.add(record);
        BankRepository.transactions.put(account.getAccountNumber(),
                transaction);
        sc.nextLine();
    }

    @Override
    public void depositMoney() {
        Account account;
        try{
            account = showAccountDetails();
        }catch(AccountNotFound acc){
            throw acc;
        }
        System.out.print("Enter amount to deposit: ");
        double amount  = sc.nextDouble();
        sc.nextLine();
        account.deposit(amount);
        ArrayList<String> transaction = BankRepository.
                transactions.get(account.getAccountNumber());
        transaction.add(LocalDateTime.now()+" | credit | "+ amount);
        BankRepository.transactions.put(account.getAccountNumber(),
                transaction);
        System.out.println("amount deposited successfully");


    }

    @Override
    public void withdrawMoney() {
        Account account;
        try{
           account = showAccountDetails();
        }catch(AccountNotFound acc){
            throw acc;
        }
        System.out.print("Enter amount to withdraw: ");
        double amount  = sc.nextDouble();
        sc.nextLine();
        account.withdraw(amount);
        String record = LocalDateTime.now() + " | " + " debit " + " | "
                + balance;
        ArrayList<String> transaction = BankRepository.transactions
                .get(account.getAccountNumber());
        transaction.add(record);
        BankRepository.transactions.put(account.getAccountNumber(),
                transaction);
        System.out.println("amount withdrawn successfully");

    }

    @Override
    public Account showAccountDetails() {
        System.out.println("Enter account number");
        String accNo = sc.nextLine();
        Account account = BankRepository.accounts.get(accNo);
        if(account == null)
            throw new AccountNotFound("Account not found");
        System.out.println(account.toString());
        return account;
    }

    @Override
    public void showAllAccounts() {
        System.out.println(BankRepository.accounts);
    }

    @Override
    public void getTransactions(int page) {
        int limit = 5;
        int skip = (page-1)*limit;
        Account account = showAccountDetails();
        ArrayList<String> transactions = BankRepository.transactions.get(account.getAccountNumber());
        if(skip>=BankRepository.transactions.size()){
            System.out.println("No data found!");
        }
        int endIndex  = Math.min(skip+limit,transactions.size());
        for(int i=skip;i<endIndex;i++){
            System.out.println(transactions.get(i));
        }

    }
}
