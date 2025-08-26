package com.sparta.tfd;

public class Methods {

    // implement this method so that it returns true if x is greater than or equal to y

    public static boolean greaterEqual(int x, int y) {

        if(x >= y){
            return true;
        }
        else{
            return false;
        }
    }

    // implement this method so that it take an int as an input,
    // squares it, adds 101, divides the result by 7, then subtracts 4.
    // return a double.
    public static double BODMAS(int inputNumber) {
        return ((inputNumber * inputNumber) + 101) / 7.0 - 4;
    }


    // implement this method so that it returns true if input is "password"
    // regardless of case
    public static boolean checkInput(String input) {
        return input.equalsIgnoreCase("password");
    }


    // implement this method so that it returns the sum of all the numbers from start to end
    public static int sumNums(int start, int end ) {
        int sum = 0; // Create a variable to store the running total
        for (int i = start; i <= end; i++){ // you know start and end number so use those as `i`. Add 1 to i each time loop runs. Loop ends after i isn't less than or equal to end number anymore.
            sum = sum + i; // add i to the sum everytime
        }
        return sum ; // return i
    }

    // implement this method so that it returns the sum
    // of all the numbers in the array nums

    public static int sumArray(int[] nums) {
        int sum = 0; // Create a variable to store the running total
        for (int x : nums) { //Loop through each number in the array
            sum += x; // same as sum = sum + x;
        }
        return sum;
    }
}
