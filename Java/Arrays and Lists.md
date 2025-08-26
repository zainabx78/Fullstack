# Collections

- Group together a number of items that are related to eachother.

1. **Arrays and Lists** - Items in collections are indexed (1, 2, 3). A series of values (mostly of the same type e.g. integers, strings etc).
   - The index numbers begin with 0 so it's labelled as 0 and then 1, 2 etc. 
2. **Maps** - Left hand column is used as a key, right hand side is used to store a value corresponding to that key. 
   - Everything is stored as a key value pair. E.g. "age":35.


### Comparison of arrays and lists. 
- In arrays - can retrieve values with their indexed positions but that's pretty much all you can do with them. 
- Can do a lot more with lists!!!
  - Advantage of lists: Can change the number of elements. 
  - Lists have other utility functions available too. E.g. add, remove, sort, replace elements and more. Those are not available with arrays.



## Arrays and Lists

- A simple array in Java:

```java
public class HelloWorld {
    public static void main(String[] args) {
        int[] myIntArray = {23, 12, 34, 54, 65};
        System.out.println(myIntArray[0]);
    }

}
```

- [0] is the first value in the array, so output would be 23. 


### Printing out all the elements of an array: Using FOR

```java
public class HelloWorld {
    public static void main(String[] args) {
        int[] myIntArray = {23, 12, 34, 54, 65};
        for (int element:  myIntArray ){
            System.out.println(element);
        }
    }

}

```
### Reassigning values in an array:


- `myIntArray[2] = 39; ` --> This changes the value in the array at the [2] index position to 39. So, in code would look like this:

```java
public class HelloWorld {
    public static void main(String[] args) {
        int[] myIntArray = {23, 12, 34, 54, 65};
        myIntArray[2] = 39;
        for (int element:  myIntArray ){
            System.out.println(element);
        }
    }

}

```

- Can also use `Integer []  ` class instead of `int []`. 


## Lists

- Advantage of lists: Can change the number of elements. 
- Lists have other utility functions available too. E.g. add, remove, sort, replace elements and more. Those are not available with arrays.
- This code block shows usage of a list: 

```java

public class HelloWorld {
    public static void main(String[] args) {
        Integer [] myIntArray = {23, 12, 34, 54, 65};
        java.util.List <Integer> myList = java.util.Arrays.asList (myIntArray); 
        myList.set(2, 89) ; 
        for (int element:  myList ){
            System.out.println(element);
        }
    }

}
```

### Explaining the code: 

1. `java.util.List <Integer> myList = java.util.Arrays.asList ` 
  - This converts the arry `myIntArray` into a list using `Arrays.asList()`
  - Any change to myList will also change myIntArray.
  - This list is fixed to whatever amount of elements the array has. 
2. `myList.set(2, 89);`
    - Changes the element at index position 2 to 39. 

3. 
```java
for (int element : myList) {
    System.out.println(element);
}
```

- This is an enhanced FOR loop. 
- Goes through each element in myList and prints it. 


### Changing number of elements in a list:


- Need to make the list (previously made) into an array list to be able to add additional elements to it. 


```java
public class HelloWorld {
    public static void main(String[] args) {
        Integer [] myIntArray = {23, 12, 34, 54, 65};
        java.util.List <Integer> myList = java.util.Arrays.asList (myIntArray);
        java.util.ArrayList<Integer> myArrayList = new java.util.ArrayList<Integer>(myList) ;
        myArrayList.set(2, 89) ;
        myArrayList.add(1234);
        for (int element:  myArrayList){
            System.out.println(element);
        }
    }

}

```

### Explaining the code:

1. `java.util.ArrayList<Integer> myArrayList = new java.util.ArrayList<Integer>(myList) ;` 
   - This creates an array list called `myArrayList` from the list called `myList`.
2. `myArrayList.add(1234);` 
   - This adds another element to the list. 