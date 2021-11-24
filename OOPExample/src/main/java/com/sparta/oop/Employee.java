package com.sparta.oop;

public class Employee extends Person {
    public Employee(String department, String firstName, String lastName, String postcode) {
        super(firstName, lastName, postcode);
        this.department = department;
    }

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
