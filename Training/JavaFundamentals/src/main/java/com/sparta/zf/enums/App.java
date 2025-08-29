package com.sparta.zf.enums;

public class App {

    // This code block is if you use these days in the main section without creating an enum which i later created below.
    // Don't need this anymore since I created enum.
//    public static final int MONDAY = 0; // final means once you've set it, can't change it.
//    public static final int TUESDAY = 1;
//    public static final int WEDNESDAY = 2;
//    public static final int THURSDAY = 3;
//    public static final int FRIDAY = 4;
//    public static final int SATURDAY = 5;
//    public static final int SUNDAY = 6;


    public static void main(String[] args) {
        // a way to print out whether its a weekday or weekend depending on day of the week.
        Day dayOfTheWeek = Day.SUNDAY;

        if (dayOfTheWeek == Day.SATURDAY || dayOfTheWeek == Day.SUNDAY) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday!");
        }


        switch (dayOfTheWeek) {
            case MONDAY: // because there's no break statement or anything, it falls through all the way down to thursday.
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Have a lovely day at work!");
                break;
            case FRIDAY:
                System.out.println("Nearly the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Have a nice weekend!");
                break;
        }

    }
}
