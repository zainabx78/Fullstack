package com.sparta.zf.oop.zoo;

import java.time.LocalDate;

// Main class called staff that implements interface called Speakable (this interface is like a full abstract class --> doesnt need body)
    // Only have to put return type, name and arguments it takes.
    // 100% abstract classes
    // No concrete implementation of any methods.
public class Staff implements Speakable {
    private String staffName;
    private String DateOfEmployment;
    private String enclosure;

    public Staff(String staffName, int year, int month, int day, String enclosure) {
        this.staffName = staffName; // specific to reference the object, otherwise it will reference the class.
        this.DateOfEmployment = String.valueOf(LocalDate.of(year, month, day));
        this.enclosure = enclosure;

    }

    // Getters and setters
    public String getStaffName(){
        return staffName;
    }

    public String getEnclosure(){
        return this.enclosure;
    }

    public String getDateOfEmployment() {
        return DateOfEmployment;
    }

    @Override
    public String speak() {
        return "";
    }
}
