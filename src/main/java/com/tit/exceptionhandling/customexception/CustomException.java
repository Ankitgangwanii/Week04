package com.tit.exceptionhandling.customexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException {

    public static void invalidAgeException( int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Invalid Age Exception found");
        }
        else{
            System.out.println("Eligible to Vote");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of the Person");
        int age = input.nextInt();
        try {
            invalidAgeException(age);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
