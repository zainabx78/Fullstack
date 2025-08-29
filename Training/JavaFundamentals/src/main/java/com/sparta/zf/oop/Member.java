package com.sparta.zf.oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Member {
    // Making them private hides the variables from direct outside access.
    private final String firstName;
    protected String lastName; // Protected means that the field/method is only available within the class and the derived classes.
    private LocalDate localDate;

    // Constructor
    // Must have same name as the class
    // It's just a special method.
    public Member(String firstName, String lastName, int year, int month, int day) {
        this(firstName, lastName); // Can use this line instead of like below, separate lines for first name and last name.
        this.localDate = LocalDate.of(year, month, day);
    }

// Polymorphism --> using another constructor for the same class: members with only 2 fields such as first nice and last name will be forwarded to this constructor.
    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.localDate = LocalDate.now();
    }

    // If no constructor is in class, by default a parameterless constructor is put in the class.
    //


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
    } // Until calculates amount of time between one date and another.

    @Override
    public String toString() {
        return getFullName() + " has been member for " + getMemberDays() + " days.";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Member member)) return false; // check to see if obj is a member. If it is a member it will be referred to as "member"

        // checking whether the firstname of the this object, is the same as the firstname of the the object we're comparing it to, same with lastname and joindate
        // Spcific implementation (overriding) of the equals method to say if the names are same, the objects are also the same.
        return Objects.equals(firstName, member.firstName) && Objects.equals(lastName, member.lastName) && Objects.equals(localDate, member.localDate);

    }

    @Override
    public int hashCode() { // Makes hashcodes equal for members in app code. This makes it so that the 2 members become 1. They become truly equal.
        return Objects.hash(this.firstName, this.lastName, this.localDate);
    }
}
