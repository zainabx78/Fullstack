package com.sparta.zf.oop.exercises;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public abstract class Animal {
    private String name;
    private LocalDate birthdate;

    // Constructor
    public Animal(String name, int year, int month, int day) {
        this.name = name;
        this.birthdate = LocalDate.of(year, month, day);
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }


    // Age in years
    public int getAge() {
        return (int) ChronoUnit.YEARS.between(birthdate, LocalDate.now());
    }


    // Override toString
    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + getAge() + "} +";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        else {
            return Objects.equals(name, animal.name) && Objects.equals(birthdate, animal.birthdate);
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate);

    }

    // Abstract method
    public abstract String speak();
}
