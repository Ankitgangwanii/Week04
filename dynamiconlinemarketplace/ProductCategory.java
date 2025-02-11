package com.tit.dynamiconlinemarketplace;

abstract class ProductCategory {
    protected String categoryName;

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
