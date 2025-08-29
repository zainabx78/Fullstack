package com.sparta.zf.oop.exercises;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Buddy", 2020, 6, 15, "Fetch"));
        animals.add(new Cat("Lily", 2018, 3, 10));
        animals.add(new Dog("Max", 2019, 11, 5, "Tug-of-war"));

        for (Animal a : animals) {
            System.out.println(a.speak());
            System.out.println(a.toString());
        }
    }
}
