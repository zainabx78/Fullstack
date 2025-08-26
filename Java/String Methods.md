# String Methods

```java
public class HelloWorld {
    public static void main(String[] args) {
        String message = "Python is the best programming language";
        String newMessage = message;
        System.out.println(newMessage);
    }
}

```
- This just prints out the variable newMessage which includes the variable message. 
- If you add a method to the string then you can do things with it. E.g

1. `String newMessage = message.toUpperCase();` --> converts the string in the message variable to uppercase. 
2. Replaces the part of string you want to replace with something else.
   
```java

public class HelloWorld {
    public static void main(String[] args) {
        String message = "Python is the best programming language";
        String newMessage = message.replace ( "Python" , "Java") ;
        System.out.println(newMessage);
    }
}
```

## Documentation for Java string class:

1. Oracle java documnetation website: `https://docs.oracle.com/en/java/`
2. Click on `Java SE Technical Documentation`
3. `API documentation`
4. `java.base` module. 
5. `java.lang` package.
6. `string` class.

End URL for string documentation:

`https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/String.html`