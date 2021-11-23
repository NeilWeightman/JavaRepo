package com.sparta.simple;

public class Summer {
    public int sumArray(int[] myArray){
        int total = 0;
        for(int value:myArray)
            total = total + value;
        return total;
    }
}
