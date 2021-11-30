package com.sparta.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<Person> myList = new ArrayList<>();
//        myList.add("Hello"); // not allowed because arg must be a Person
        myList.add(new Person("Talal", "Thaheem"));
        myList.add(new Person("George", "Edwards"));

        Collections.sort(myList);
        System.out.println(myList);

//        Container<String> strContainer = new Container<>();
//        strContainer.storeInstance("Mihai");
//        String value = strContainer.retrieveInstance();
//        System.out.println(value);

        Container<Employee> personContainer = new Container<>();
        personContainer.storeInstance(new Employee("Mark", "Burnitt"));
        Employee person = personContainer.retrieveInstance();
        System.out.println(person.getFirstName());
        person.fire();
    }
}
