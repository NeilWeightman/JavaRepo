package com.sparta;

import java.util.ArrayList;
import java.util.Iterator;

public class ListContainer implements Iterable<Person>{
    private ArrayList<Person> theList;

    public ArrayList<Person> getTheList() {
        return theList;
    }

    public void setTheList(ArrayList<Person> theList) {
        this.theList = theList;
    }

    @Override
    public Iterator<Person> iterator() {
        return theList.iterator();
    }
}
