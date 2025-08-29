package com.sparta.zf.oop.zoo;


public class Lion extends Animal{

    public Lion(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    public String getAnimalName(){
        return "The lion's name is: " + getName();
    }

    @Override
    public String speak() {
        return "I'm the lion, " + getName() + " I was born on: " + getBirthdate();
    }

}
