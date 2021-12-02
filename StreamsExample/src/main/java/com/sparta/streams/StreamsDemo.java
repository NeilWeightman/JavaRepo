package com.sparta.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(List.of("Anthony", "Yefri", "George", "Kamil", "Talal", "Alex",
                "Konrad", "Pruthvi", "Nikolaos", "Ishmael", "Jakub", "Mihai", "Ed",
                "Mark", "Ignas", "Leo", "Ria"));
        // using lambda
        String combinedNames = myList.stream()
                .filter(str -> str.length() <= 4)
                .peek(s -> System.out.println(s))
                .reduce((s1, s2) -> s1 + s2).get();
        System.out.println(combinedNames);
        System.out.println(myList.stream().anyMatch(s -> s.length() > 8));
        int totalChars = myList.stream()
                .reduce(0,
                        (s1, s2) -> s1 + s2.length(),
                        (l1, l2) -> l1 + l2);
        System.out.println(totalChars);
        myList.stream().map(s -> s.length()).forEach(s-> System.out.println(s));
//                .forEach(s -> System.out.println(s));
        // anonymous inner class version
//        myList.stream()
//                .forEach(new Consumer<String>(){
//                    public void accept(String s) {
//                        System.out.println(s);
//                    }});
        // using method reference
//        myList.stream().forEach(System.out::println);

        // old school
//        for(int i = 0; i < myList.size(); i++){
//            myList.set(i, myList.get(i) + " Spartan");
//            System.out.println(myList.get(i));
//        }
//        System.out.println(myList);
    }
}
