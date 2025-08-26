package com.sparta.zf.refactoring;


public class App {
    public static void main(String[] args) {

        int timeOfDay = 21;
        String result = getGreeting(timeOfDay);
        System.out.println(result);
    }

    public static String getGreeting(int timeOfDay) {
        if (timeOfDay >= 5 && timeOfDay < 12){
            return "Good Morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18){
            return"Good Afternoon!";
        } else {
            return "Good Evening!";
        }
    }
}
