package com.assingment.day16.encapsulation.qsn2;



public class Main {
 public static void main(String[] args) {
     BankAccount account = new BankAccount();

     account.setAccountNumber("SB-09876");
     account.setBalance(2000.0);

     String accountNumber = account.getAccountNumber();
     double balance = account.getBalance();

     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: " + balance);
 }
}

