# DATA TYPES

### Numbers
- Integers (whole numbers) e.g. 1, 2, 3, 4. 

### Strings
- Anything involving characters or text. 

### Boolean
- Anything either true or false. 


### Number Operators

- In the `System.out.println();` section, can enter numbers in the brackets too. e.g. `System.out.println(5 * 5);` will give you `25` in the output. 
- `%` this prints out the remainder e.g. `100%3` will print out the remainder left when 100 is /3. The remainder is 1. 
- Other normal operators e.g. `/`, `+`, `*`, `-`. `%`. 

### Boolean Relational

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(true);
    }
}

```
- The output is printed out as `true` because java interprets it at 1 or 0 and then prints out true or false based on that. 
- `==` is equal to. Compares values. e.g. when you run `System.out.println(4 == 4);` - output is `true`. 
- `!=` - not equal to. e.g. `System.out.println(3 != 4);` - output is `true`.
- `<` less than. 
- `>` more than. 
- Can't compare an integer with a string e.g. `(4 < "5")` --> gives error. But can use length to compare instead e.g. `(4 < "5".length())` thats, 4 < 1. It's always false. 

- Boolean class - takes string as parameter and tries to understand it as boolean value. 

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(Boolean.parseBoolean("true"));
    }
}

```
- Output = `true` . Function is not case sensitive. 
- Checks if the string contains the letters `true` it returns true. 
- **Anything else returns false.**

### String Basics

- Single quotes `'` represent characters. E.g. `'H'`
- Double quotes `"` represent strings. 
- `\t` - tab. E.g. `Hello\tWorld` --> output will be a big space in the middle. 
- `("\u0061")` --> Prints the letter a. 0061 is the base16 number code for `a`. 


### Functions on a string

- Working out length of strings - 
```java
System.out.println("Hello, World!".length())
``` 
--> gives you length as output. This would output 13. 
- The `.` operator shows a lot of functions available on a string. 
- E.g. Want to convert string all to uppercase letters --> 
``` java
System.out.println("Hello, World!".toUpperCase());
``` 
- E.g. Show the letter/character at a specific position in string --> 
```java
System.out.println("Hello, World!".charAt(1));
```
- Output shows `e`. (Positioning starts at 0 then 1,2,3 etc) - so, `H` = position 0. 
- E.g. Want to get back part of the string: E.g. only want to get back `World!`

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!".substring(7));
    }
}

```
- It's starts from the W which is position 7 in the string (space and comma count too!)

### Topic assessment questions:

- Example code:
```java
public static void main(String[] args) {
	int a = 12;    
	double b = 1.6;
	System.out.println( a/b );
}
```

- Sets a as 12, b as 1.6. Divides them both to get 7.5 output. 
- These will NOT compile:
  
1. `int i = 4.52` --> this is a decimal, not whole number so not integer. 
2. `char c = 'char'` --> single quotes can't contain string. Only single characters. 
3. `char c = "z"` --> The `char` part stores characters not strings.