package com.sparta.oop;

import java.util.Random;

public class SpartaShop {
    public static void main(String[] args) {
        Customer mark = new Customer(); // default constructor, zero-argument ctor
        System.out.println(mark.toString());
        mark.setCustomerId(1234);
        mark.setFirstName("Mark");
        mark.setLastName("Burnitt");
        mark.setPostcode("SE1 0AA");

        System.out.println(mark.toString());

        Customer talal = new Customer("Talal",
                "Thaheem", "SW1A 1AA");
        System.out.println(talal.getFirstName());

        Employee alex = new Employee("Dev", "Alex", "Susanu", "POSTCODE");
        System.out.println(alex);
        alex.sendEmail("You're fired!");

        Customer ria = new Customer(567, "Ria", "Janani", "ABCDEF");
        System.out.println(ria.getLastName());
        System.out.println(ria.getPostcode());
        System.out.println(ria.getClass().getName());
        ria.sendEmail("Thanks for your order");

        Person pruthvi = new Customer();
        pruthvi.sendEmail("Hi!");

        Person p;
        Random r = new Random();
        if(r.nextInt(10) > 5)
            p = new Customer(567, "Ria", "Janani", "ABCDEF");
        else
            p = new Employee("Dev", "Alex", "Susanu", "POSTCODE");
        p.sendEmail("This is a message for you");

    }
}
