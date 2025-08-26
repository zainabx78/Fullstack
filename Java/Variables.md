# Variables
 
## Creating a new variable:
- What type of variable you want to create e.g. `int`
- Variable needs a name e.g. `a` - Naming convention for variables is lowerCamelCase (first lword is lowercase, other words are uppercase for first letter).
- What the variable stores (the content) e.g. `123` or you can create the variable in one line and assign the value in another line.
 
 
## Naming of variables:
 
- Must start with $, _, or a letter- A-Z.
- Cannot use reserved keywords e.g. public, true, class etc.
- Case sensitive.
 
## In the code block:
 
Example:
 
```java
int a; // Declaration of variable
a=123; // Assignment of the value for variable
```
or
 
```java
int a = 123; // Declaration and initialization in one step
 
```
 
So, in the code block it would look like this:
- Set the variable
- Print the variable
 
```java
public class HelloWorld {
    public static void main (String[]args) {
 
        int a = 123;
        int b;
        b = 456;
        double c = 123.456;
        String name = "Zainab";
        system.out.printIn(a);
    }
}
 
 
```
 
## Double variable:
 
- `double` e.g. a decimal point number e.g. 123.456
- So, the variable would look like: `double c = 123.456;`
The variable type is double, the name of the variable is c and the value stored is 123.456.
 
## String variable:
 
- `String` - e.g. any words or letters in the value of the variable.
- Capital `S` on string - because classes should be written in UpperCamelCase.
- E.g. `String name = "Zainab";` and print `name` in the print section: `system.out.printIn(name);`
 
## Changing what's stored in a variable
 
- E.g . if the variable is `String name = "Zainab";`, to change what's stored in the variable, you just have to reassign the value in the variable. So here it would be
`name = "Brittany";`.
- So the value changes in the variable by assigning a new value to the variable.
- The original value disappears.
- You can also print the original value on the line before the line where you change the value to get both values. E.g.
 
```java
public class HelloWorld {
    public static void main (String[]args) {
 
        String name = "Brittany";
        system.out.printIn(name);
 
        name = "Zainab";
        system.out.printIn(name);
    }
}
```
 
 
 
