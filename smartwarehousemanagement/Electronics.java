package com.tit.smartwarehousemanagement;

public class Electronics extends WareHouseItem{
    private int price;
    public Electronics(String product_Name, int price){
        super(product_Name);
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void display(){
        System.out.println("Electronics - " +getName()+ " whose price is "+price);
        System.out.println("---------------------------------------------------");
    }
}
