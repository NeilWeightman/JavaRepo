package com.sparta.fib.test;

import com.sparta.fib.FibonacciIterativeImpl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    private static FibonacciIterativeImpl fib;

    @BeforeAll
    public static void setUpAll(){
        fib = new FibonacciIterativeImpl();
    }

    @AfterEach
    public void tearDown(){
        System.out.println("That's another test done!");
    }

    @DisplayName("Test the fibonacci sequence for 3 elements")
    @Test
    public void testFibForValueOfThree(){
        String expectedResult = "0, 1, 1";
        String actual = fib.fibonacci(3);
        assertEquals(expectedResult, actual);
    }

    @Test
    public void testFibForNegativeValue(){
        String result = fib.fibonacci(-1);
        assertEquals(null, result);
    }

    @Test
    public void testForZeroValue(){
        String result = fib.fibonacci(0);
        assertNull(result);
    }
}
