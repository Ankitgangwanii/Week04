package com.tit.smartwarehousemanagement;

public class Furniture extends WareHouseItem{
    private int price;
    public Furniture(String product_Name,int price){
        super(product_Name);
        this.price = price;
    }

    public int getPrice(){
       return price;
    }

    public void display(){
        System.out.println("Furniturw - " +getName()+ " whose price is "+price);
        System.out.println("---------------------------------------------------");

    }
}
