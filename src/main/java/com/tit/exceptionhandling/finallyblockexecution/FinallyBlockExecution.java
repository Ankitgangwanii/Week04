package com.tit.exceptionhandling.finallyblockexecution;

import javax.swing.*;
import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Numerator");
        int a = input.nextInt();
        System.out.println("Enter the Denominator");
        int b = input.nextInt();
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Operation Completed");
        }
    }
}
