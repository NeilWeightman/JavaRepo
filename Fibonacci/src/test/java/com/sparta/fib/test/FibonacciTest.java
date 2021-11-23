package com.sparta.fib.test;

import com.sparta.fib.Fibonacci;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FibonacciTest {
    @DisplayName("Test the fibonacci sequence for 3 elements")
    @Test
    public void testFibForValueOfThree(){
        String expectedResult = "0, 1, 1, ";
        Fibonacci fib = new Fibonacci();
        String actual = fib.fibonacci(3);
        assertEquals(expectedResult, actual);
    }

    @Test
    public void testFibForNegativeValue(){
        Fibonacci fib = new Fibonacci();
        String result = fib.fibonacci(-1);
        assertEquals(null, result);
    }

    @Test
    @Disabled
    public void testForZeroValue(){
        fail();
    }
}
