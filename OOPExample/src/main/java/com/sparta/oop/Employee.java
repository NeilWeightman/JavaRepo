package com.sparta.oop;

public class Employee extends Person {
    public Employee(String department, String firstName, String lastName, String postcode) {
        super(postcode, firstName, lastName);
        this.department = department;
    }

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                '}';
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Sending email to " + getFirstName() + " ("
                + getDepartment() + ") " + message);
    }
}
