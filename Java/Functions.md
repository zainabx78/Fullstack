# Functions

- Correct syntax for defining a function in Java:
  - `public String functionName (int value)`



## Simple Function + call of function:

1. Simple call of function
```java 

public class HelloWorld {

    // Setting a function called `printSomething`
    public static void printSomething(){
        System.out.println("This is a message. ");
    }


    // Calling the function in main
    public static void main (String[] args) {
        printSomething();
    }
}

```


2. Giving an input:
   - In this function, when the print

```java

public class HelloWorld {

    // Creating a function called printName that prints out a string. 

    public static void printName(String fullName){
        System.out.println("The full name is " + fullName);
    }


    // Giving an input for the function. The function adds this input into the string it prints out. 

    public static void main (String[] args) {
        printName("Zainab Farooq");
    }
}

```

3. Can also split that into 2 arguments:

- Difference is that you have to provide first and last name as separate strings when calling the function. 


```java

public class HelloWorld {
    public static void printName(String firstName, String lastName){
        System.out.println("The full name is " + firstName + " " + lastName);
    }
    public static void main (String[] args) {
        printName("Zainab",  "Farooq");
    }
}

```

4. A function that gives something back

```java
public class HelloWorld {

    // This function runs last (2nd) - the only one that prints something. Takes the output of the concatenate function and prints it out.
    public static void printName(String fullName){
        System.out.println("The full name is " + fullName);
    }

    // Concatenate function - This function runs first- takes both first name and last name inputs and concatenates them into one string.

    public static String makeFullName(String firstName, String lastName){
        String fullName = firstName + " " + lastName ;
        return fullName ;
    }
    
    // This just gives the input to the concatenate function.
    public static void main (String[] args) {
        printName(makeFullName("Zainab",  "Farooq"));
    }
}

```