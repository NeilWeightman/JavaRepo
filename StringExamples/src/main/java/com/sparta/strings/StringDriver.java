package com.sparta.strings;

public class StringDriver {
    public static void main(String[] args) {
        String s = "Hello, world!";
        String s2 = new String("Hello, world!"); // creates a new object, not in the pool
        // s2 = s2.intern(); // moves the object to the pool
        System.out.println(s == s2); // == for objects compares object references
                                     // are they the same object?
        System.out.println(s.equals(s2));
        String leo = "Leo";
        String yefri = "Yefri";
        System.out.println(yefri.compareTo("Yefri"));

        StringBuffer sb = new StringBuffer(yefri);
        sb.append("Velasquez");
        sb.insert(5, ", ");
        System.out.println(sb);

//        yefri = yefri.concat(" Velasquez");
//        System.out.println(yefri);
        StringBuilder result = new StringBuilder("-");
        for (int i = 0; i < 100; i++){
            result.append("-");
        }
        System.out.println(result.length());
        System.out.println(result);

        String myNumber = "07345345-345";
        if(myNumber.matches("[0-9]{5}\s*[0-9]{3}\s*[0-9]{3}")){
            System.out.println("Phone number found");
        }
    }
}
