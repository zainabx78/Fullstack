package com.sparta.zf.oop;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.HashSet;

// Using the constructor
public class App {
    public static void main(String[] args) {


//        // new calls the constructor of Member (object instance in Member)
//        Member nish = new Member("Nish", "Mandal", 2022 , 1, 23);
//        Member john = new Member("John", "Morgan", 2023, 6, 25);
//        Member jane = new Member("Jane", "Smith", 2024, 3, 10);
//        Member noel = new Member("Noel", "Gallagher");
//
//        // Print out their names using getter methods
//        System.out.println(nish.getFirstName() + " " + nish.getLastName());
//        System.out.println(john.getFirstName() + " " + john.getLastName());
//        System.out.println(jane.getFirstName() + " " + jane.getLastName());
//
//
//        //Print out days since they joined
//        System.out.println(nish.getFullName() + " has been a member for " + nish.getMemberDays() + " days.");
//        System.out.println(john.getFullName() + " has been a member for " + john.getMemberDays() + " days.");
//        System.out.println(jane.getFullName() + " has been a member for " + jane.getMemberDays() + " days.");
//
//        // Create an array of Member objects:
//        Member [] members = {nish, jane, john};
//
//        // Loop through them and print their full names
//        System.out.println("\nAll Members:");
//
//        for (Member a : members) {
//            System.out.println(a.getFullName());
//        }
//
//        // Different constructor used (member + baseballmember).
//        BaseballMember zainab = new BaseballMember("Zainab", "Farooq", 2022,12,6, "fielder");
//        System.out.println(zainab.getFullName());
//        System.out.println(zainab.getMemberDays());
//        System.out.println(zainab.getPosition());
//        zainab.setPosition("pitcher");
//        System.out.println(zainab.getPosition());
//
//        // Can use different constructor members together
//        //Member [] members1 = {nish, jane, zainab};
//
//        // These methods are inherited from object class
//        // Can be overridden in own class.
//        System.out.println(nish.getClass()); // Returns class type of object
//        System.out.println(nish.toString()); //
//        System.out.println(nish.equals(jane));
//        System.out.println(nish.hashCode()); // returns integer object in hashcode. If 2 objects are equal, they have same hashcode.
//        System.out.println(jane.hashCode());
//
//        System.out.println(zainab.getClass());
//        System.out.println(zainab.toString());
//        System.out.println(zainab.hashCode());
//
//        for (Member m : members){
//            System.out.println(m.toString());
//        }
//
//        Shape rectangle = new Rectangle(5, 5);
//        System.out.println(rectangle);
//
//        Shape circle = new Circle(5);
//        System.out.println(circle);
//
//        Shape [] shapes = {rectangle, circle};
//
//        for (Shape a : shapes){
//            System.out.println(a);
//        }
//
//
//        // Interface code:
//
//        Printable [] printables = {rectangle, circle};
//
//        for (Printable p : printables){
//            System.out.println();
//
//        }
//
//
//

        int a = 1;
        int b = 1;
        System.out.println(a == b);

        // HASHCODES
        // These members have same info but theyre not the same, different references in heap, different hashcodes.
        Member member1 = new Member("Nish", "Mandal", 2022, 1, 1 );
        Member member2= new Member("Nish", "Mandal", 2022, 1, 1 );
        Member member3 = member1; // This stores memory location of member 1 in member3 (both will be the same reference).
        System.out.println(member2.equals(member1)); // --> false.

        System.out.println(member1.equals(member3)); // this is true because they have same reference.

        System.out.println(member2.hashCode());
        System.out.println(member1.hashCode());

        HashSet<Member> members = new HashSet<>();

        members.add(member2);
        members.add(member1);

        HashSet<Integer> ints = new HashSet<>();


        ints.add (1);
        ints.add (1);
        ints.add (2);
        ints.add (3);

    }
}
