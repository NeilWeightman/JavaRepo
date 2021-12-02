package com.sparta;

import java.util.Iterator;
import java.util.Random;

public class MyIterator implements Iterator<Integer> {
    private Random rand;

    public MyIterator() {
        rand = new Random();
    }

    @Override
    public boolean hasNext() {
        return rand.nextInt(1000) != 0;
    }

    @Override
    public Integer next() {
        return rand.nextInt(1000);
    }
}
