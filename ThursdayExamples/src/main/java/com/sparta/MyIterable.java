package com.sparta;

import java.util.Iterator;

public class MyIterable<T> implements Iterable<T> {
    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>();
    }
}
