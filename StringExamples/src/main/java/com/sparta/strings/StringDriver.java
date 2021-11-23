package com.sparta.strings;

import java.util.HexFormat;

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

        String fullName = sb.toString();
        fullName = fullName.replace('Y', 'J');
        System.out.println(fullName);
        System.out.println(fullName.substring(5, 8));
        System.out.println(String.valueOf(123.456f));

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
        StringDriver d = new StringDriver();
        System.out.println(d);
        HexFormat fmt = HexFormat.of();
        System.out.println(fmt.toHexDigits(d.hashCode()));

        String allNames = "Anthony, Yefri, George, Kamil, Talal, Alex, Konrad, Pruthvi, " +
                "Nikolaos, Ishmael, Jakub, Mihai, Ed, Mark. Ignas, Leo, Ria";

        for (String nextName: allNames.split("[,.] "))
            System.out.println(nextName);

    }

    public String toString() {
        return "StringDriver{This is my lovely class}";
    }
}
