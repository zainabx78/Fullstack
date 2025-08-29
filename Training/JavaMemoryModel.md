# Java Memory Model
- Byte code is platform independent. 
- JVM converts byte code into machine readable code. (Dependent on machine that java is running on).

## JDK

- JVM - Java Virtual machine (different for every software).
- Library classes
- These both are in the JRE - Java Runtime Environment
- Development tools

## Value and Reference types

- **Stack** = fast access memory - last in last out. Value types or references. 
- **Heap** = larger area of memory, holds reference of where item is located on the stack. 
- Anything derived from a class is stored in the heap (E.g. String or any datatype starting with capital letter.)
- ints or other datatypes with lowercase will be stored in stack. 
- When out of scope, the objects in memory are dead because there's no references anymore (e.g. when out of curly brackets in method).


## Garbage collector

- Reference variables can go out of scope --> left in memory. 
- Garbage collector identifies dead objects on the heap. 
- Free up memory.
- Makes heap smaller.
- Move live objects closer to eachother to optimise space - compaction. 


## Hashcode 

- Contract/rule: 2 methods are equal if .equals is true, but they must override the hashcode too. 
- 2 objects are only truly equal if they have the same hashcode. 
- 2 different objects may have the same hashcode (just assigned randomly) but theyre not the same. 

- Overriding hashcodes (to make objects equal in hashsets or lists):

```java 

    @Override
    public int hashCode() { // Makes hashcodes equal for members in app code. This makes it so that the 2 members become 1. They become truly equal. 
        return Objects.hash(this.firstName, this.lastName, this.localDate);
    }
```