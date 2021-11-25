package com.sparta.oop;

public class Supplier extends Person {

    public Supplier(String postcode, String firstName, String lastName) {
        super(postcode, firstName, lastName);
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Supplier: " + message);
    }
}
