package com.tit.exceptionhandling.nestedtrycatch;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[]{10,20,30,40};
        int divisor = input.nextInt();
        try{
            try{
                System.out.println(arr[arr.length]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            System.out.println(arr[2]/divisor);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
