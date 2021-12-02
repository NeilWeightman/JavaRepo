package com.sparta;

import java.util.ArrayList;
import java.util.List;

public class IterableDriver {
    public static void main(String[] args) {
        MyIterable<Integer> iter = new MyIterable<>();
        for(Integer val: iter){
            System.out.print(val + " ");
        }
        System.out.println();
        while(iter.iterator().hasNext()){
            System.out.print(iter.iterator().next() + " ");
        }
        System.out.println();
        ListContainer lc = new ListContainer();
        lc.setTheList(new ArrayList<>(List.of(new Person(), new Person())));
        for(Person p: lc){
            System.out.println(p);
        }
    }
}
