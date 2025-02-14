package com.tit.exceptionhandling.multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchBlocks {

    public static void multipleCatchBlock(int []arr, int index){
        try{
            System.out.println(arr[index]);
            System.out.println(arr.length);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.printf(e.getMessage());
        }
        catch (NullPointerException e ){
            System.out.printf(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = input.nextInt();
        System.out.println("Enter the Elements of the Array");
        int[] arr = new int[n];

        for(var a : arr){
            arr[a] = input.nextInt();
        }
        System.out.println("Enter the index want to Retrieve ");
        int index = input.nextInt();

        multipleCatchBlock(arr,index);

    }

}
