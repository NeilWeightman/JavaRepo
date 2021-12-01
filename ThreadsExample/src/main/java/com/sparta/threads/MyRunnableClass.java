package com.sparta.threads;

import java.util.ArrayList;
import java.util.Random;

public class MyRunnableClass implements Runnable {
    private ArrayList<String> theSharedList;

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        this.theName = theName;
    }

    private String theName;

    public ArrayList<String> getTheSharedList() {
        return theSharedList;
    }

    public void setTheSharedList(ArrayList<String> theSharedList) {
        this.theSharedList = theSharedList;
    }

    @Override
    public void run() {
        System.out.println("In run() for object " + theName);
        for(int i = 0; i< 10; i++)
            addString();
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finishing run() " + theName);
    }

    private synchronized void addString() {
        theSharedList.add(theName);
    }
}
