package com.sparta.zf.oop.zoo;

import java.time.LocalDate;

public abstract class Animal implements Speakable{

    private String name ;
    private String birthdate ;

    public Animal(String name, int year, int month, int day) {
        this.name = name;
        this.birthdate = this.birthdate = String.valueOf(LocalDate.of(year, month, day));
    }

    // Getters and setters

    public String getName(){
        return name;
    }

    public String getBirthdate(){
        return birthdate;
    }

}
