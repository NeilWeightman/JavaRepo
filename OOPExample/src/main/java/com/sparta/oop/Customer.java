package com.sparta.oop;

public class Customer extends Person {
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
        super(firstName, lastName, postcode);
        this.customerId = customerId;
    }

    public Customer(String firstName, String lastName, String postcode){
        this(0, firstName, lastName, postcode); // ctor chaining
    }

    public String convertToString(){
        return "Customer #" + customerId + ": " + getFirstName() + " " + getLastName() + ", " + getPostcode();
    }
}
