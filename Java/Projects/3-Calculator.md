## Creating a calculator

- Need to create 2 classes: in src folder - right click and create class.

1. CalcMain
- This gives output of whatever numbers you put into the function


```java
public class CalcMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(12, 12));

    }

}


```


2. Calculator

```java

public class Calculator {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract (int num1, int num2){
        return num1 - num2;
    }
}

```


## FINAL CODE:

1. CalcMain class :

```java

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(12, 12));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which operation? (a or s): ");
        String choice = scanner.next();
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        if (choice.equals("a")){
            System.out.println(calc.add(firstNumber, secondNumber));

        }else if (choice.equals("b")){
            System.out.println(calc.subtract(firstNumber, secondNumber));

        } else {
            System.out.println("invalid choice!");

        }

    }

}

```

2. Calculator 

```java

public class Calculator {
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract (int num1, int num2){
        return num1 - num2;
    }
}

```


## Adding an exit section to exit application:

- Adding a while loop : while choice doesn't = x, keep the loop going. 

```java

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(12, 12));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which operation? (a or s, x to exitx): ");
        String choice = scanner.next();

        while(!choice.equals("x")) {

            System.out.println("Enter the first number:");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the second number:");
            int secondNumber = scanner.nextInt();

            if (choice.equals("a")) {
                System.out.println(calc.add(firstNumber, secondNumber));

            } else if (choice.equals("b")) {
                System.out.println(calc.subtract(firstNumber, secondNumber));

            } else {
                System.out.println("invalid choice!");

            }
            System.out.println("Which operation? (a or s, x to exit): ");
            choice = scanner.next();
        }
    }

}
```