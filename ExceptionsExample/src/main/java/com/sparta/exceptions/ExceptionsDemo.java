package com.sparta.exceptions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args) throws SpartaException{
        Scanner scan = new Scanner(System.in);
        try {
            someMethod();
            anotherMethod(scan.next());
        } catch (ParseException|ArithmeticException e) {
            throw new SpartaException(e);
        } finally {
            System.out.println("Some code which is always executed");
        }
    }

    public static void someMethod(){
        int i = 12;
        int j = 0;
//        ArrayList<Integer> theList = new ArrayList<>();
//        try {
//            while (true) {
//                theList.add(1234);
//            }
//        } catch (OutOfMemoryError e){
//            e.printStackTrace();
//        }
//        try {
//            int k = i / j;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
    }

    public static void anotherMethod(String dateString) throws ParseException{
        Date today = null;
        DateFormat df = new SimpleDateFormat("yyMMdd");
        try {
            today = df.parse(dateString);
        } finally {
            System.out.println("Doing this anyway");
        }
        System.out.println(today);
    }
}
