package com.sparta.collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap();
        myMap.put("Anthony", 23);
        myMap.put("Yefri", 30);
        myMap.putAll(Map.of("George", 21,
                "Kamil", 24, "Talal", 25, "Alex", 31, "Konrad", 34, "Pruthvi", 18,
                "Nikolaos", 44, "Ishmael", 28, "Jakub", 12, "Mihai", 90));
        myMap.putAll(Map.of("Ed", 17, "Mark", 35, "Ignas", 62, "Leo", 17, "Ria", 29));
        System.out.println(myMap.get("Ed"));
        System.out.println(myMap);
        Set<String> names = myMap.keySet();
        List<String> listOfNames = new ArrayList<>(List.copyOf(names));
        System.out.println(listOfNames);
        Collections.shuffle(listOfNames);
        System.out.println(listOfNames);
    }
}
