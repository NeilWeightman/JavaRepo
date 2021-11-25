package com.sparta.oop;

public abstract class Person {
    private String postcode;
    private String firstName;
    private String lastName;

    public Person(String postcode, String firstName, String lastName) {
        this.postcode = postcode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        // validate postcode
        this.postcode = postcode;
    }

    public abstract void sendEmail(String message);
}
