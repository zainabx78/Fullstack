package com.sparta.zf.oop.zoo;

import com.sparta.zf.oop.exercises.Animal;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Lion lion = new Lion("Sam", 2020, 2, 1);

        Zookeeper zookeeper1 = new Zookeeper("Zainab", 2022, 2, 1, "Lions");

        System.out.println(zookeeper1.feedAnimal());
        System.out.println(zookeeper1.getEnclosure());

        System.out.println(lion.getAnimalName());
        System.out.println(zookeeper1.enclosureName());

        // Polymorphic list of "things that can talk"
        ArrayList<Speakable> zooThings = new ArrayList<>();
        zooThings.add(lion);
        zooThings.add(zookeeper1);

        // Make them talk --> the output of this whole project
        for (Speakable s : zooThings) {
            System.out.println(s.speak()); // --> uses the interface and because the interface is overridden in each staff and animal, prints out different things based on the object (lion, staff etc).
        }
    }

}
