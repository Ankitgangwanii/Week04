package com.tit.mapinterface;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

class EmployeeGrouping {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ankit", "HR"),
                new Employee("Aadarsh", "IT"),
                new Employee("Deepti", "HR"),
                new Employee("Darshan", "IT"),
                new Employee("Aditya", "Finance")
        );

        Map<String, List<Employee>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach((dept, empList) ->
                System.out.println(dept + ": " + empList)
        );
    }
}

