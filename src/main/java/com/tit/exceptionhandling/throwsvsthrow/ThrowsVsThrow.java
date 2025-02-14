package com.tit.exceptionhandling.throwsvsthrow;

import java.util.Scanner;

public class ThrowsVsThrow {
    public static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if(rate< 0 || amount < 0 || years < 0){
            throw new IllegalArgumentException("Amount, Rate or Years must be positive");
        }
        else
        {
            System.out.println(amount * rate * years);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount");
        double amount = input.nextDouble();
        System.out.println("Enter the Rate ");
        double rate = input.nextDouble();
        System.out.println("Enter the Years");
        int years = input.nextInt();
        try {
            calculateInterest(amount, rate, years);
        }
        catch(IllegalArgumentException e){
            System.out.printf(e.getMessage());
        }
    }
}
