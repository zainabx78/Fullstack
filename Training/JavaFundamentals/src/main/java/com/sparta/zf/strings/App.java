package com.sparta.zf.strings;

public class App {
    public static void main(String[] args) {
        String name = "   Nish   ";
        char c = name.charAt(4);
        name = name.toLowerCase();
        name = name.trim();
        c = name.charAt(3);
        System.out.println(name);

        System.out.println();
        System.out.println(stringExercise("  Java list fundamentals ")); // methods shouldnt have print lines so printing this method in main.

        //Split function --> array of all the different words based on argument given --> space in this example, or `,`.

        String theSentence = "I'm really glad to be training at Sparta";
        String[] theWords = theSentence.split(" ");

        String statement = "I came, I saw, I conquered";
        String [] theClauses = statement.split(",");



    }

    public static String stringExercise(String myString){ // new method to be referenced in main section/
        myString = myString.toUpperCase();
        myString = myString.trim();
        myString = myString.replace("L", "*");
        myString = myString.replace("T", "*");
        var npos = myString.indexOf('N');
        var finalString = myString.substring(0, npos +1); // inclusive of 0 but not 2nd number so have to plus one to include the 2nd index.
        // Output will be from index 0 to whatever N is + 1.
        return finalString;
    }


}
