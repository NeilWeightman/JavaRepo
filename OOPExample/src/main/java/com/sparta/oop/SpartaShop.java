package com.sparta.oop;

import java.util.Random;

public class SpartaShop {
    public static void main(String[] args) {
        Customer mark = new Customer(); // default constructor, zero-argument ctor
        System.out.println(mark.convertToString());
        mark.setCustomerId(1234);
        mark.setFirstName("Mark");
        mark.setLastName("Burnitt");
        mark.setPostcode("SE1 0AA");

        System.out.println(mark.convertToString());

        Customer talal = new Customer("Talal",
                "Thaheem", "SW1A 1AA");
        System.out.println(talal.getFirstName());

        Employee alex = new Employee("Dev", "Alex", "Susanu", "POSTCODE");
        System.out.println(alex);

        Person ria = new Customer(567, "Ria", "Janani", "ABCDEF");
        System.out.println(ria.getLastName());
        System.out.println(ria.getPostcode());
        System.out.println(ria.getClass().getName());

        int[] myArray = {2,5,3,4,6,7,4,2};
        int[] myArray2 = new int[100];
        Random r = new Random();
        r.nextInt(1000)
    }
}
