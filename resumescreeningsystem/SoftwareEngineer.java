package com.tit.resumescreeningsystem;

public class SoftwareEngineer extends JobRole {
    private int experience;
    public SoftwareEngineer(int experience) {
        super("Software Engineer");
        this.experience = experience;
    }

    @Override
    public boolean selectionResult() {
        if(experience >=2){
            return true;
        }
        return false;
    }
}
