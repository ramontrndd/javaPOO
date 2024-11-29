package application;


import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ProgramAccount {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));


        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.println("Total balance: " + String.format("%.2f", sum));

        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for (Account acc : list) {
            System.out.println("Updated balance for account " + acc.getNumber() + ": " + String.format("%.2f", acc.getBalance()));
        }
    }
}
