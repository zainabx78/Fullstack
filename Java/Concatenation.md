# Concatenation Escape

- Can use the + operator to add strings together.
- E.g:

```java
public class HelloWorld {
    public static void main (String[]args) {

        String firstName = "Zainab";

        String lastName= "Farooq";

        system.out.printIn(firstName + lastName);
    }
}
 
```

- If you want  space between the names, add another string container space in the middle:

`system.out.printIn(firstName + " " + lastName); `

`hello`


- Add age in too:

```java
public class HelloWorld {
    public static void main (String[]args) {

        String firstName = "Zainab";

        String lastName= "Farooq";

        int age = 23;
    
        system.out.printIn(firstName + " " + lastName + " " + age);
    }
}
 
```

- Java converts what it can into a string if it isn't a string and adds it on to the string. (int isnt a string but java converts it).

```java
public class HelloWorld {
    public static void main (String[]args) {

        String firstName = "Zainab";

        String lastName= "Farooq";

        int age = 23;
    
        system.out.printIn(firstName + " " + lastName + " " + age);
    }
}
```


- Using double quotes within a string - 
- Output of following code is: ` Zainab's last name is "Farooq"  ` :


```java
public class HelloWorld {
    public static void main(String[] args) {
        String firstName = "Zainab";
        String lastName = "Farooq";
        int age = 23;
        System.out.println(firstName + "'s last name is \"" + lastName + "\"");
    }
}

```
