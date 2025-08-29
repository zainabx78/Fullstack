# Arrays

- immutable 
- Once we declare array and size, can't change it (length).
- ArrayList = can add and take away from it as u want.

```java

package com.sparta.zf.controlflows;

public class Loops {
    public static void main(String[] args) {
        String[] names = new String[]{"Vineet", "Zainab", "Farah", "Haashim", "Dayana"};
        String zainab = names[0];
        System.out.println(zainab);

        int[] myArray = {1, 2, 3, 4, 5};

        double[] weights = new double[4]; // Length of the empty array = 4
        weights[0] = 3.5;
        weights[1] = 4.2;
        weights[2] = 7.1;


        // foreach/enhanced for loop: Used for forward iteration through an array, when you just want to READ the value.
        // No access, just reading the values:

        for (double d : weights) {
            System.out.println(d);
        }

        // incrementing through array in loop - FOR LOOP
        for (int i = 0 ; i < weights.length; i++){
            System.out.println(weights[i]);
        }

        // While loop
        int i = 0;
        while (i < weights.length){
            System.out.println(weights[i]);
            i ++ ;
        }

        // Do while loop --> it runs atleast once.

        i = 0;
        do{
            System.out.println(weights[i]);
            i++;
        } while (i < weights.length);




        // ACTIVITY --> RETURNING HIGHEST VALUE FROM NUMS ARRAY WITH DIFFERENT LOOPS


        int[] nums =  { 10, 6, 22, -17, 3 };
        System.out.println("Highest foreach loop: " + highestForEachLoop(nums));
        System.out.println("Highest for- loop: " + highestForLoop(nums));
        System.out.println("Highest while- loop: " + highestWhileLoop(nums));
        System.out.println("Highest do-while loop: " + highestDoWhileLoop(nums));

    }

    private static int highestDoWhileLoop(int[] nums) {
        return -1;
    }

    private static int highestWhileLoop(int[] nums) {
        int highest =  Integer.MIN_VALUE;
        int i = 0;
        while ( i < nums.length){
            if (highest < nums [i]){
                highest = nums[i];
            } i++;
        }
        return highest;
    }

    private static int highestForLoop(int[] nums) {
        int highest =  Integer.MIN_VALUE ; // sets highest as a really low number
        for (int i = 0; i < nums.length; i++){
           if (highest < nums [i]){
               highest = nums [i];
           }
        } return highest;
    }

    private static int highestForEachLoop(int[] nums) {
        int highest =  Integer.MIN_VALUE ; // setting highest as 0 wont work if there's negative numbers

        for(int num : nums) {
            if (num > highest) {
                highest = num;
            }
        } return highest ;
    }

}

```