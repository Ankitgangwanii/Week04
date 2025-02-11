package com.tit.resumescreeningsystem;

public class DataScientist extends JobRole{
    private int experience;
    public DataScientist(int experience){
        super("Data Scientist");
        this.experience = experience;
    }

    public boolean selectionResult() {
        if(experience >=1){
            return true;
        }
        return false;
    }
}
