package com.sparta.zf.streams;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        List<String> beatles = new ArrayList<>(List.of("John", "Paul", "George", "Ringo" ));

        // Print out name starting with J
        // IMPERATIVE way --> step by step

        for (String beatle : beatles){
            if (beatle.startsWith("J")){
                System.out.println(beatle);
            }

        }

        // DECLARATIVE way --> functional
        // stream --> like a collection/pipeline
        // lambda expressions.

        beatles.stream() // creates a stream of beatles
                // The name variable is assigned to each name in the beatles list one by one.
                .filter(name -> name.startsWith("J")) // The stream provides the first element which is john. Then checks the other elements. Iterates through.
                .forEach(name -> System.out.println(name)); // this is only acted upon once the stream runs through each value in the stream in the previous step and moves to this step if it's true.

        // FILTER

        List <Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4,5));

        nums.stream()
                .filter(num -> num % 2 == 0 )
                .forEach(System.out::println);

        // Using the same nums list:



        // MAP

        List<String> upperNames = beatles.stream()
                // Map will perform a function on each element in the collection
                .map(name -> name.toUpperCase())
                .toList(); // stores all the uppercase names in toList.
        System.out.println(upperNames);

        // Sum
        int sum = nums.stream().mapToInt(num -> num).sum();
        System.out.println(sum);

    }
}


