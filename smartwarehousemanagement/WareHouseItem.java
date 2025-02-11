package com.tit.smartwarehousemanagement;

abstract class WareHouseItem {
    private String product_Name;

    public WareHouseItem(String product_Name){
        this.product_Name = product_Name;
    }

    public String getName(){
        return product_Name;
    }

    abstract public void display();

    public String toString() {
        return this.getClass().getSimpleName() + ": " + product_Name;
    }
}
