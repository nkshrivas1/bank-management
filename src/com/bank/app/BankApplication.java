package com.bank.app;


import com.bank.model.Account;
import com.bank.repository.BankRepository;
import com.bank.service.BankServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        // create a 2 d array list
        // find target elemen t
        Scanner sc = new Scanner(System.in);
        BankServiceImpl bank = new BankServiceImpl();
        int choice;
        while(true){
            System.out.println("1. Create Account");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw ");
            System.out.println("4. Details ");
            System.out.println("5. All accounts ");
            System.out.println("6. All transactions ");
            System.out.println("9. Exit. ");

            choice = sc.nextInt();
            switch(choice){
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.depositMoney();
                    break;
                case 3:
                    bank.withdrawMoney();
                    break;
                case 4:
                    bank.showAccountDetails();
                    break;
                case 5:
                    bank.showAllAccounts();
                    break;
                case 6:
                    bank.getTransactions(1);
                case 9:
                    return;
            }
        }
    }
}
