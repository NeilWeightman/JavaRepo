package com.sparta.generics;

public class Employee extends Person{

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public void fire(){
        System.out.println("You're fired!");
    }
}
