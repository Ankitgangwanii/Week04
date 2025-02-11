package com.tit.smartwarehousemanagement;

public class WareHouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.itemsAdd(new Electronics("TV",12000));
        electronicsStorage.itemsAdd(new Electronics("Mobile",50000));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.itemsAdd(new Groceries("Detergent",20));
        groceriesStorage.itemsAdd(new Groceries("Milk",55));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.itemsAdd(new Furniture("Chair",800));
        furnitureStorage.itemsAdd(new Furniture("Sofa",5000));

        electronicsStorage.display();
        groceriesStorage.display();
        furnitureStorage.display();
    }
}
