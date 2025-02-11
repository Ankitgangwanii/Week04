package com.tit.dynamiconlinemarketplace;

public class MarketPlace {
    public static void main(String[] args) {
        Product<Book> book = new Product<>("The Great Gatsby", 20.0, new Book());
        Product<Clothing> shirt = new Product<>("T-Shirt", 15.0, new Clothing());
        Product<Gadgets> phone = new Product<>("Smartphone", 500.0, new Gadgets());

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println(" Product Catalog Before Discount:");
        System.out.println();
        catalog.displayCatalog();

        System.out.println(" Discount applied!\n");
        Discount.applyDiscount(book, 10);
        Discount.applyDiscount(shirt, 5);
        Discount.applyDiscount(phone, 20);

        System.out.println("\n Product Catalog After Discount:\n");
        catalog.displayCatalog();
    }
}

