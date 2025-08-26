# Maps 

## Hash map

- Every element in a map is a key-value pair. 
- Need to specify the types- the data type of the key and the datatype of the value. 

```java
public class HelloWorld {
    public static void main(String[] args) {

        java.util.HashMap<String, String> myMap = new java.util.HashMap<String, String>();
        myMap.put("Jim", "07374 647783") ;
        System.out.println(myMap.get("Jim"));
    }


}

```
### Explaining the code:


- `java.util.HashMap<String, String> myMap = new java.util.HashMap<String, String> () ;` 
  - This line means that we're creating a new Hash map called myMap and the datatypes of both key and value is String. In the brackets, string string is the type of data for both key and value. 
  - This map is created empty hence the empty () at the end.


- `myMap.put("Jim", "07374 647783") ;` 
  - This line puts a key value pair into the map. The key is Jim. 

- `System.out.println(myMap.get("Jim"));` 
  - This line prints the value of the key provided. The key Jim is provided but the output will be the number which is the value of the key. 


### Doing the same with multiple elements and FOR loop:

- This code block retreives all the values of every key. 

```java

public class HelloWorld {
    public static void main(String[] args) {

        java.util.HashMap<String, String> myMap = new java.util.HashMap<String, String>();
        myMap.put("Jim", "03453 43783");
        myMap.put("Jane", "07345 27783");
        myMap.put("Bob", "23434 76578");
        myMap.put("Pete", "07223 90989");
        myMap.put("Tom", "09874 876433");
        myMap.put("Lily", "07374 647783");
        myMap.put("Steve", "07374 689767");

        for (String element: myMap.values())
            System.out.println(element);
    }


}

```


- Retrieving all the keys instead of the values:

- **change myMap.values to myMap.keyset:**

```java
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {

        java.util.HashMap<String, String> myMap = new java.util.HashMap<String, String>();
        myMap.put("Jim", "03453 43783");
        myMap.put("Jane", "07345 27783");
        myMap.put("Bob", "23434 76578");
        myMap.put("Pete", "07223 90989");
        myMap.put("Tom", "09874 876433");
        myMap.put("Lily", "07374 647783");
        myMap.put("Steve", "07374 689767");
        for (String element: myMap.keySet())
            System.out.println(element);
    }


}
```

### Changing values stores in the key:

- Using `put` function again, and replacing what was stored in the key before:

```java
public class HelloWorld {
    public static void main(String[] args) {

        java.util.HashMap<String, String> myMap = new java.util.HashMap<String, String>();
        myMap.put("Jim", "03453 43783");
        myMap.put("Jane", "07345 27783");
        myMap.put("Bob", "23434 76578");
        myMap.put("Pete", "07223 90989");
        myMap.put("Tom", "09874 876433");
        myMap.put("Lily", "07374 647783");
        myMap.put("Steve", "07374 689767");
        myMap.put("Jim", "Jim's New number"); // This is the new line!
        for (String element: myMap.values())
            System.out.println(element);
    }


}

```

## Entry set --> printing out the whole map. 

- Returns an entry object.
- Often the easiet way to iterate over a map when you need both key value pairs printed out. 
- Don't need to use extra get calls to find each value
- Prints out as key = values format. 


```java
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {

        java.util.HashMap<String, String> myMap = new java.util.HashMap<String, String>();
        myMap.put("Jim", "03453 43783");
        myMap.put("Jane", "07345 27783");
        myMap.put("Bob", "23434 76578");
        myMap.put("Pete", "07223 90989");
        myMap.put("Tom", "09874 876433");
        myMap.put("Lily", "07374 647783");
        myMap.put("Steve", "07374 689767");
        myMap.put("Jim", "Jim's New number");
        for (java.util.Map.Entry<String, String> element: myMap.entrySet())
            System.out.println(element);
    }


}
```

- If want to just print keys in this way - `System.out.println(element.getKey());` --> This will display just the keys. 
- If want to just print values in this way - `System.out.println(element.getValue());` --> This will display just the values. 