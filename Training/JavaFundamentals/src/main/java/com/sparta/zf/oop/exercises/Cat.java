package com.sparta.zf.oop.exercises;

public class Cat extends Animal {
    public Cat(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public String speak() {
        return "Meow!";
    }

    @Override
    public String toString() {
        return "Cat{name='" + getName() + "', age=" + getAge() + "}";
    }
}
