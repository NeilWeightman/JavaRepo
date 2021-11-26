package com.sparta.fib;

import java.util.Scanner;

public class FibDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String implName = scan.next();
        Fibonacci fib = FibonacciFactory.getImpl(implName);
        System.out.println(fib.fibonacci(10));
    }
}
