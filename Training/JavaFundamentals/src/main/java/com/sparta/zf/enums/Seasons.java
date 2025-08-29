package com.sparta.zf.enums;

public class Seasons {

    public static void main(String[] args) {

        seasonEnum seasonOfYear = seasonEnum.AUTUMN;
        if (seasonOfYear == seasonEnum.SPRING) {
            System.out.println("The daffodils are out!");
        } else if (seasonOfYear == seasonEnum.SUMMER) {
            System.out.println("The sun is out!");
        } else if (seasonOfYear == seasonEnum.WINTER) {
            System.out.println("It's the season of SNOW!");
        } else {
            System.out.println("The leaves are falling!");
        }

        // Printing out each season in the seasonEnum through a for each loop.
        for (seasonEnum s : seasonEnum.values()){
            System.out.println(s);

        }
    }
}
