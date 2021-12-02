package com.sparta.streams;

import java.util.Iterator;

public class LambdasDemo {
    public static void main(String[] args) {
        String name = "Neil";
//        Iterable<String> myObj = new Iterable<String>() {
//            @Override
//            public Iterator<String> iterator() {
//                System.out.println(name);
//                return null;
//            }
//        };
        Iterable<String> myObj = () -> {
            System.out.println("Hello, " + name);
            return null;
        };

        for(String s:myObj){

        }
    }
}
