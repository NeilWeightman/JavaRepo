package com.sparta.fib;

public class FibonacciFactory {
    public static Fibonacci getImpl(String implName){
        if(implName.equals("Iterative"))
            return new FibonacciIterativeImpl();
        else if(implName.equals("Recursive"))
            return new FibonacciRecursiveImpl();
        else
            return null;
    }
}
