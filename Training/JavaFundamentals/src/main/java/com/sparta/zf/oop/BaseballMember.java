package com.sparta.zf.oop;
// Inheritance:

public class BaseballMember extends Member { // uses previous member constructor to avoid repeating code

    // Define the fields
    private String position; // Can only be used in this class.

    // Constructor
    public BaseballMember(String firstName, String lastName, int day, int month, int year, String position) {
        super(firstName, lastName, day, month, year); // Goes into  the Member constructor as that's the parent
        this.position = getPosition();
    }

    // Getters and setters --> creates methods
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Overriding an existing behaviour (from object class) to do something else.

    @Override
    public String toString() {
        return super.toString() + " position " + position;
    }
}
