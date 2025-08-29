package com.sparta.zf.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate nextWeek = now.plusWeeks(1);
        System.out.println(nextWeek);
        LocalDate anotherDate = now.withDayOfMonth(5).withYear(2025);
        System.out.println(anotherDate);
        if(anotherDate.getMonth().equals(nextWeek.getMonth())){
            System.out.println("Yes they are in the same moth");
        } else {
            System.out.println("Different months");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        var mydate = LocalDate.parse("09-10-2002", formatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("d MMMM, yy");

        System.out.println(mydate.toString());
        System.out.println(mydate.format(outputFormatter));


        LocalDate nishBday = LocalDate.of(1989, 11, 2);
        var currentdate = LocalDate.now();

        //work out how old i am
        Period periodBetween = Period.between(nishBday, currentdate);
        System.out.println(periodBetween.getYears());

        // ChronoUnits


        long daysDifference = ChronoUnit.DAYS.between(nishBday, LocalDate.now());
        int ageInYears = (int) (daysDifference / 365.25);
        System.out.println(ageInYears);

        // how many days left till bday

        LocalDate nextBirthday = LocalDate.of(LocalDate.now().getYear(), nishBday.getMonth(), nishBday.getDayOfMonth());
        long daysUntilBirthday = ChronoUnit.DAYS.between(LocalDate.now(), nextBirthday);
        System.out.println(daysUntilBirthday);



    }
}
