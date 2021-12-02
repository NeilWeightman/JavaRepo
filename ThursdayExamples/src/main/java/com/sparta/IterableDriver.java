package com.sparta;

public class IterableDriver {
    public static void main(String[] args) {
        MyIterable iter = new MyIterable();
        for(Integer val: iter){
            System.out.print(val + " ");
        }
        System.out.println();
        while(iter.iterator().hasNext()){
            System.out.print(iter.iterator().next() + " ");
        }
    }
}
