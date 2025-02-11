package com.tit.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeMain {
        public static void main(String[] args) {
            List<Resume<? extends JobRole>> resumes = new ArrayList<>();

            resumes.add(new Resume<>("Ankit", new SoftwareEngineer(3)));
            resumes.add(new Resume<>("Aadarsh", new DataScientist(0)));
            resumes.add(new Resume<>("Aditya", new ProductManager(0)));

            System.out.println("Screening: \n");
            for (Resume<? extends JobRole> resume : resumes) {
                System.out.println( resume);
            }

        }

}
