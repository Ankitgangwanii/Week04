package com.tit.resumescreeningsystem;

public class ProductManager extends JobRole {
    private int experience;
    public ProductManager(int experience) {
        super("Product Manager");
        this.experience = experience;
    }

    public boolean selectionResult() {
        if(experience >=3){
            return true;
        }
        return false;
    }
}
