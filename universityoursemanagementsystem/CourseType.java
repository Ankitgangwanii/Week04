package com.tit.universityoursemanagementsystem;

abstract public class CourseType {
    private String course_Name;
    public CourseType(String typeName) {
        this.course_Name = typeName;
    }

    public String getTypeName() {
        return course_Name;
    }
}
