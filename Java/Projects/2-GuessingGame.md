# Java Guessing Game

- Programme is going to be generating a random number and user is going to guess what that number is. 


## First --> simple code to print a random number:
- This code prints out a random number but could be over 10 digits long. Hard to guess. 


```java
public class HelloWorld {
    public static void main(String[] args) {

        java.util.Random rand  = new java.util.Random();

        System.out.println(rand.nextInt());
    }
}
```

- **Specifying a range:** just type in `100` within the nextInt brackets and `bound:` should automatically be added to it - press enter. 
- Code with limit of 100 added. (+1 because just 100 means 0-99 but now it'll be 1-100).
- Also added packaga at top so don't have to reference the `java.util`  everytime.

```java
import java.util.Random;
public class HelloWorld {
    public static void main(String[] args) {
        Random rand  = new Random();
        System.out.println(rand.nextInt(100) + 1 ) ;
    }
}

```

## Getting Input From the Keyboard/User:
- Using scanner utility class:
  


```java

Scanner scan = new Scanner(System.in);

```

So, it looks like: 

```java
import java.util.Random;
import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {

        //Random number generator:

        Random rand  = new Random();
        System.out.println(rand.nextInt(100) + 1) ;
        
        //Input:

        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        System.out.println(guess);
    }
}
```

## FINAL CODE FOR GAME TO WORK:

```java

import java.util.Random;
import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {

        Random rand  = new Random();
        Scanner scan = new Scanner(System.in);
        boolean gameContinue = true;
        int randomNumber = rand.nextInt(100) + 1 ;

        while (gameContinue) {
            System.out.println("Enter a guess");
            int guess = scan.nextInt();
            if (guess < randomNumber) {
                System.out.println("You've guessed low!");
            } else if (guess > randomNumber){
                System.out.println("You've guessed too high!");
            } else {
                System.out.println("You've guessed correctly!");
                gameContinue = false;
            }

        }
    }
}

```
