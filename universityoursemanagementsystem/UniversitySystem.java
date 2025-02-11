package com.tit.universityoursemanagementsystem;

public class UniversitySystem {
    public static void main(String[] args) {
        Course<ExamCourse> mathExam = new Course<>("Calculus", "Mathematics", new ExamCourse());
        Course<AssignmentCourse> csAssignment = new Course<>("Java Programming", "Computer Science", new AssignmentCourse());
        Course<ResearchCourse> bioResearch = new Course<>("Genetics", "Biology", new ResearchCourse());

        CourseCatalog catalog = new CourseCatalog();
        catalog.addCourse(mathExam);
        catalog.addCourse(csAssignment);
        catalog.addCourse(bioResearch);

        System.out.println(" University Course Catalog:\n");
        catalog.displayCatalog();
    }
}
