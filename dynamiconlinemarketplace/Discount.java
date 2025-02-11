package com.tit.dynamiconlinemarketplace;

public class Discount {
    public static <T extends ProductCategory> void applyDiscount(Product<T> product, double percentage) {

        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println(" New price of " + product.getName() + ": " + product.getPrice());
    }
}
