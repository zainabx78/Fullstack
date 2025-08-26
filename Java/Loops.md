# Loops

1. While loop --> some kind of boolean expression (true or false) --> loop will continue until the expression is false.
   - 2 Versions 
2. For loop --> go through collection of data e.g. arrays. 
   - 2 Versions



## While Loop

### Infinite loop --> 

- The condition is always true (we set it as true) so the loop will just keep going on. 

```java
public class HelloWorld {
    public static void main(String[] args) {

        boolean loopControl = true ; // WE SET THE VALUE AS TRUE SO IT'S ALWAYS TRUE
        while (loopControl == true){
            System.out.println("We're inside the loop! :)");
        }
    }


}
```

- Can stop the loop by pressing red button in intelliJ where the loop is getting printed. 


### Changing conditions so it's not always true

- This code block sets a variable called counter.
- The while loop  = if counter is less than 10, print the counter and also add 1 to the counter.
- So this only prints up to 9 and then stops. Because 10 is not less than 10 and so the loop is now false and it has to stop. 


```java
public class HelloWorld {
    public static void main(String[] args) {

        int counter = 0 ;
        while (counter < 10){
            System.out.println("Counter:" + counter);
            counter = counter + 1 ;
        }
    }


}
```
### Simplifying `counter = counter + 1 ;`


1. Can also simplify this line of code: `counter = counter + 1 ;` 
   - Can use the operator `+=` which applies whatever's on the right hand side to the left hand side:
   - So new code line simplified would look like: `counter += 1;`
   - -=, /= and *= also exists. 

2. Using `++` --> increments the value --> `counter ++;` would give the same output as the above. 


## Using IF statements inside the WHILE loop

```java
public class HelloWorld {
    public static void main(String[] args) {

        int counter = 0 ;
        while (counter < 10){
            if (counter % 2 == 0)
                System.out.println("Counter:"+ counter);
            else
                System.out.println("Number is odd");
            counter++;
        }
    }
}

```

- If the remainder of counter/2 is 0, then print the counter (if the remainder is 0 it means the counter number is even).
- Else print that the number is odd. 


## Do While loop:

- Big difference is that the condition is checked at the end not at the start. 
- So, the loop will run atleast once. 

```java

public class HelloWorld {
    public static void main(String[] args) {

        int counter = 0 ;

        do {
            if (counter % 2 == 0)
                System.out.println("Counter:"+ counter);
            else
                System.out.println("Number is odd");
            counter++;
        } while (counter < 10);
    }
}

```

# FOR LOOPS

1. This for loop just prints out every value in the array list called `intArray`.
```java

for (int element: intArray){
            System.out.println(element);

}
```

2. This prints out everything in the string array:

```java
 for (String element: nameList){
            System.out.println(element);
}

```

3. Different way of printing out everything:
- Both data structures are indexed with int so:
- Create an int variable. Initialise it with 0 as that's what the int indexing starts with (positioning in array).
- It prints out all the elements in array one by one. 
  

```java

 for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
}

```

- Can get a more **detailed** output using:

```java

for (int i = 0; i < intArray.length; i++){
            System.out.println("Element number" + i + " is " + intArray[i]);
}
```