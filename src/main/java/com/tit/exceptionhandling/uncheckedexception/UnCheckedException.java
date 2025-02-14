package com.tit.exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b;
        try{
            System.out.println("Enter the Numerator");
            a = input.nextInt();
            System.out.println("Enter the Denominator");
            b = input.nextInt();
            System.out.println(a/b);
        }
        catch (InputMismatchException e){
            System.out.println(e + " is found");
        }
        catch (ArithmeticException e){
            System.out.println(e + " is found");
        }
        finally {
            input.close();
        }
    }
}
