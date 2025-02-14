package com.tit.exceptionhandling.exceptionpropagation;

public class ExceptionPropagation {
    public static void method1(){
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }
    public static void method2(){
        method1();
    }

    public static void main(String[] args) {
        try{
            method2();
        }
        catch (ArithmeticException e){
            System.out.println("Exception Handled in Main");
        }
    }
}
