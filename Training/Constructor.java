// MEMBER FILE:
package com.sparta.zf.oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Member {

    private final String firstName; // Making them private hides the variables from direct outside access.
    private String lastName;
    private final LocalDate localDate;

    // Constructor
    // Must have same name as the class
    // It's just a special method.
    public Member(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName; // this` means the field within the class will be set to that parameter.
        this.lastName = lastName;
        this.localDate = LocalDate.of(year, month, day);
    }


    // Encapsulation
    // Getters and Setters allow controlled access to the private variables

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;

    }
    public long getMemberDays(){
        return localDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }
}


// MAIN FILE:

package com.sparta.zf.oop;

import java.time.LocalDate;

// Using the constructor
public class App {
    public static void main(String[] args) {
        Member nish = new Member("Nish", "Mandal", 1 , 1, 2022);
        Member john = new Member("John", "Morgan", 15, 6, 2023);
        Member jane = new Member("Jane", "Smith", 10, 3, 2024);


        // Print out their names using getter methods
        System.out.println(nish.getFirstName() + " " + nish.getLastName());
        System.out.println(john.getFirstName() + " " + john.getLastName());
        System.out.println(jane.getFirstName() + " " + jane.getLastName());

        //Print out days since they joined
        System.out.println(nish.getFullName() + " has been a member for " + nish.getMemberDays() + " days.");
        System.out.println(john.getFullName() + " has been a member for " + john.getMemberDays() + " days.");
        System.out.println(jane.getFullName() + " has been a member for " + jane.getMemberDays() + " days.");

        // Create an array of Member objects:
        Member [] members = {nish, jane, john};

        // Loop through them and print their full names
        System.out.println("\nAll Members:");

        for (Member a : members) {
            System.out.println(a.getFullName());
        }



    }
}
