package com.sparta.zf.oop.zoo;

public class Zookeeper extends Staff{


    public Zookeeper(String staffName, int year, int month, int day, String enclosure) {
        super(staffName, year, month, day, enclosure);
    }

    public String feedAnimal(){
        return this.getStaffName() + " is feeding the " +getEnclosure();
    }

    public String enclosureName(){
        return "The enclosure is called: " + getEnclosure();
    }

    @Override
    public String speak() {
        return "Hello, I'm " + getStaffName() + " from the zoo staff";
    }


}
