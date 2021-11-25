package com.sparta.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingExample {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(List.of(123, 345, 678, 234, 23, 77, 99));
        System.out.println(intList);
        Collections.sort(intList); // this is fine
        System.out.println(intList);

        List<Customer> custList = new ArrayList<>(List.of(
                new Customer(12, "Konrad", "Dlugosz", "ABCDEF"),
                new Customer(56, "Jakub", "Olender", "ABCDEF"),
                new Customer(7, "Ishmael", "Shariff", "ABCDEF"),
                new Customer(4, "Mihai", "Tanasa", "ABCDEF"),
                new Customer(80, "Ed", "Bencito", "ABCDEF")
        ));
        System.out.println(custList);
        Collections.sort(custList); // this doesn't compile
        System.out.println(custList);
        Scanner in = new Scanner(System.in);
        String value = in.next();
        String another = in.next();
        System.out.println(value + " " + another);

    }
}
