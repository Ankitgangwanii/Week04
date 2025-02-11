package com.tit.smartwarehousemanagement;

public class Groceries extends WareHouseItem{
    private int price;
    public Groceries(String product_Name, int price){
        super(product_Name);
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void display(){
        System.out.println("Groceries - " +getName()+ " whose price is "+price);
        System.out.println("---------------------------------------------------");
    }
}
