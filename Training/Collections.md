# Collections

- Collections are a set of interfaces and classes to store, manipulate and retrieve groups of objects. 
- Located in the java.util package. 
- Provides data structure .e.g lists, sets, maps etc. 
- Collection (interface) → root interface for lists, sets, queues.

- Collections (class) → utility class with algorithms & helper methods.

E.G.

```java

import java.util.*;

public class CollectionsUtilityDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Charlie", "Alice", "Bob"));

        Collections.sort(names); // Alphabetical
        System.out.println("Sorted: " + names);

        Collections.reverse(names); // Reverse
        System.out.println("Reversed: " + names);

        Collections.shuffle(names); // Randomize
        System.out.println("Shuffled: " + names);

        System.out.println("Min: " + Collections.min(names));
        System.out.println("Max: " + Collections.max(names));
        System.out.println("Frequency of 'Alice': " + Collections.frequency(names, "Alice"));
    }
}

```

## Sub-interfaces:
- List (ordered, allows duplicates)
  - Examples: ArrayList, LinkedList, Vector, Stack

- Set (unordered, no duplicates)
  - Examples: HashSet, LinkedHashSet, TreeSet

- Queue (FIFO, or priority-based)
  - Examples: PriorityQueue, ArrayDeque

- Map (separate hierarchy)
  - Stores key-value pairs (like a dictionary).
  - No duplicate keys allowed.
  - Examples: HashMap, LinkedHashMap, TreeMap, Hashtable


An example of code using arraylist:

```java

import java.util.ArrayList;
import java.util.List;


public class App{
    public static void main (String[] args) {
        List <Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,));
        system.out.println("The original list is: " + list);

        list.add(2, 7); // This adds the element 7 at index 2. 

        system.out.println("We have added the number 7 at index 2 now: " + list);

        system.out.println("The reversed list is: " + list.reversed());

        list.remove (1); // This removes the value at index 1. 

        system.out.println("We have removed the element at index position 1:  " + list);


    }
}

```

# Hash sets

- Elements are either in set or not. Comparator. 
- Internally, elements are ordered by hash code. 
- Stores unique elements only (no duplicates allowed).
- No guaranteed order → the order of iteration may change
- Fast operations → add(), remove(), contains() are on average O(1) (thanks to hashing).
- Not synchronized → if multiple threads access it, you should wrap it with Collections.synchronizedSet().

## When to Use HashSet
- When you need unique elements.
- When order doesn’t matter.
- When you want fast search, insert, and delete.


# TASK:

1. Create and unit test a method with the signature `public static HashSet<Integer> makeFiveSet (int max)` that returns a HashSet of all the integers between 1 and max inclusive of the ones divisible by 5.

```java
public class CollectionsLab {
    public static HashSet<Integer> makeFiveSet(int max){

        HashSet <Integer> set = new HashSet <>();
        for (int i = 1; i<=1; i++ ){
            if (i % 5 == 0 ){
            set.add(i);
        }
        }
        return set
    }

}

```


2. Create a unit test a method with signature `public static List<String> longWordList(String phrase)` that returns an ArrayList of all the words in the phrase that contain 5 or more letters, in the order they appear. Duplicates are allowed.


```java
public class CollectionsLab {
    public static ArrayList<String> longWordList(String phrase){
        String[] words = phrase.split (" ");
        ArrayList <String> list2 = new ArrayList<>();
        for (String word: words){
            if (word.length()>=5){
                list2.add(word);
            }
        }
        return list2;
    }

}
```


3. Create and unit test a method which return a count of all the digits (0-9) in a given string. Use a HashMap --> character class methods. 


```java
public class CollectionsLab {
    public static HashMap<Character, Ineteger> countDigitsInString (String phrase){
        HashMap <Character, Integer> digitCount = new HashMap<>(); // Dictionary-like object

        for (char c: phrase.toCharArray()){ // turns phrase into array of characters and loops through it. 
            if (Character.isDigit(c)){ // checks if the character is a digit.
                if (digitCount.containsKey(c)){ // checks if character exists in map yet.
                    digitCount.put(c, digitCount.get(c) + 1 ); // increments the count if it does

                }else{
                    digitCount.put (c, 1) // adds value to map and initialises it with 1. 
                }
            }
        } return digitCount;
    }


}
```


## Peak

- shows last thing that's put onto the stack. 


## Pop
- Takes last thing put on stack and returns it as a string. It doesnt exist on stack anymore.