# Control flow - IF statements

## Examples: 

1. In this example, the condition is always true because we've put `true` in the brackets.
```java
public class HelloWorld {
    public static void main(String[] args) {
        if (true) {
            System.out.println("The condition is true");
        }

    }
}

```

2. If age of viewer is greater than or equal to 12, the condition will be true, otherwise it will be false:

```java
public class HelloWorld {
    public static void main(String[] args) {
        int ageOfViewer = 12 ;
        if (ageOfViewer >= 12 ) {
            System.out.println("The viewer is 12 or over");
        }

    }
}

```

3. This code block will satisfy these conditions:

- If it's a movie site restricting access to movies based on age:
  - If the person is younger than 15, only U, PG and 12 films are available. 
  - If the person is younger than 18, only U, PG and 15 films are available. 
  - Otherwise, all films are available. (Older than 18).

```java

public class HelloWorld {
    public static void main(String[] args) {
        int ageOfViewer = 100 ;
        if (ageOfViewer < 15 ) {
            System.out.println("U, PG and 12 films are available");
        } else if (ageOfViewer < 18) {
            System.out.println("U, PG and 15 films are available");
        } else {
            System.out.println("All films are available");
        }


    }
}


```


4. This code block will satisfy these conditions:
- If the time is between 0500 and 12, it will print `Good Morning`.
- If the time is between 12 and 18, it will print `Good Afternoon`.
- If it's any other time, print `Good Evening`. 
- To join conditions up use `&&` which means a logical **`AND`**
- Another one is **`OR`** = || (Double pipe symbol).


```java

public class HelloWorld {
    public static void main(String[] args) {
        int timeOfDay = 10 ;
        if (timeOfDay >= 5 && timeOfDay <=12 ) {
            System.out.println("Good Morning! :)");
        }else if (timeOfDay >=12 && timeOfDay <= 18){
            System.out.println("Good Afternoon! :)");
        }else {
            System.out.println("Good Evening! :)");
        }

    }

}

```