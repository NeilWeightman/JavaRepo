package com.sparta.oop;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Customer extends Person implements Comparable<Customer>, Emailable, Serializable {
    private int customerId;
    private double accountBalance;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if(customerId > 0)
            this.customerId = customerId;
        else
            this.customerId = -1;
    }

    public Customer(){
        this(-1, "Dummy", "Dummy", "Somewhere");
    }

    public Customer(int customerId, String firstName, String lastName, String postcode){
        super(postcode, firstName, lastName);
        this.customerId = customerId;
    }

    public Customer(String firstName, String lastName, String postcode){
        this(0, firstName, lastName, postcode); // ctor chaining
    }

    public String toString(){
        return "Customer #" + customerId + ": " + getFirstName() + " " + getLastName() + ", " + getPostcode();
    }

    @Override
    public final void sendEmail(String message) {
        System.out.println("Sending email to wonderful customer " + getFirstName() + " " + message);
    }

    @Override
    public int compareTo(Customer o) {
        return o.getCustomerId() - getCustomerId();
//        return new Integer(getCustomerId()).compareTo(new Integer(o.getCustomerId()));
//        return getLastName().compareTo(o.getLastName());
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
