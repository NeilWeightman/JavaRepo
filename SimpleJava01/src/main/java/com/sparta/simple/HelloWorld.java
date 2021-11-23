package com.sparta.simple;

public class HelloWorld {
    public enum Months {JANUARY(10), FEBRUARY(20), MARCH(30),
                        APRIL(40), MAY(50), JUNE(60),
                        JULY(70), AUGUST(80), SEPTEMBER(90),
                        OCTOBER(100), NOVEMBER(110), DECEMBER(120);
        private int monthIndex;
        Months(int monthIndex){
            this.monthIndex = monthIndex; // initialising the instance variable
        }
        public int getMonthIndex() {
            return monthIndex;
        }
    }

    public static void main(String[] args) {
        simpleLoop(args);
        int myArray[] = {123, 234, 345, 456};
        Summer theSummer = new Summer();
        System.out.println(theSummer.sumArray(myArray));
        Months theMonth = Months.JULY;
        if(theMonth.equals(Months.JULY))
            System.out.println(monthName(theMonth));
    }

    private static String monthName(Months monthIndex) {
        System.out.println(monthIndex.ordinal());
        System.out.println(monthIndex.getMonthIndex());
        switch(monthIndex){
            case JANUARY: return "January";
            case FEBRUARY: return "February";
            case MARCH: return "March";
            case APRIL: return "April";
            case MAY: return "May";
            case JUNE: return "June";
            case JULY: return "July";
            case AUGUST: return "August";
            case SEPTEMBER: return "September";
            case OCTOBER: return "October";
            case NOVEMBER: return "November";
            case DECEMBER: return "December";
            default: return "Invalid month index";
        }
    }

    private static int sumMyArray(int[] myArray) {
        int total = 0;
        for(int value:myArray)
            total = total + value;
        return total;
    }

    private static void simpleLoop(String[] args) {
        int myInt = (int) 123.4; // (int) is a type cast
        int a = 15;
        float b = 4;
//        for(int i = 0; i < args.length; i++) {
        for(String element: args) { // for each
            System.out.println("Element is "+element);
        }
    }
}
