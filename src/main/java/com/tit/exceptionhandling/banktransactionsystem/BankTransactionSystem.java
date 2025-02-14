package com.tit.exceptionhandling.banktransactionsystem;

public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        try {
            account.withdraw(60000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
