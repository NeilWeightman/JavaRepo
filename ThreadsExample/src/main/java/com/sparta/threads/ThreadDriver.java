package com.sparta.threads;

import java.util.ArrayList;

public class ThreadDriver {
    public static void main(String[] args) {
        MyRunnableClass object1 = new MyRunnableClass();
        Thread t1 = new Thread(object1);
        ArrayList<String> theList = new ArrayList<>();
        object1.setTheName("Ria");
        object1.setTheSharedList(theList);
        t1.start();

        MyRunnableClass object2 = new MyRunnableClass();
        Thread t2 = new Thread(object2);
        object2.setTheName("Ishmael");
        object2.setTheSharedList(theList);
        t2.start();

        MyRunnableClass object3 = new MyRunnableClass();
        Thread t3 = new Thread(object3);
        object3.setTheName("Ed");
        object3.setTheSharedList(theList);
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(theList);
    }
}
