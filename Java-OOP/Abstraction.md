# JAVA OOP --> Object-Oriented Programming Principles

**Abstraction = Giving the user simple functions without exposing complex internal code.**
Makes code cleaner, safer, and easier to use.
- The unit of abstraction = CLASS.
- An object is an instance of a class.
- A class is a type of object. 

## Examples in Java
- Creating a simple code that returns first and last name. 
- The main program runs java application. 
- Customer object is used inside the main program. 
- Code is resuable for multiple customers.

1. OOPMain file
   
   - Takes the customer object from customer file and fills it in and calls the `print` method on the customer object. 
  
```java

public class OOPMain {
    public static void main(String[] args) {
        
        
        Customer customer = new Customer(); // Creates a new customer.
        customer.firstName = "Jyoti"; // gives the object some data.
        customer.lastName = "Suresh";
        customer.print(); // Tells the object to run it's print method to display data. 

    }
}


```


1. Customer file

   - This is just a blueprint that the main file uses and fills in. 

```java

public class Customer {
    String firstName;
    String lastName;
    void print(){ // This void print can be used to print all the customers and don't have to keep saying print each one. 
        System.out.println("First Name: " + firstName + " Last Name: " + lastName);

    }
}


```

### Do multiple customers:

- The main file: 

```java
public class OOPMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.firstName = "Jyoti";
        customer1.lastName = "Suresh";

        Customer customer2 = new Customer();
        customer2.firstName = "Rahul";
        customer2.lastName = "Patel";

        Customer customer3 = new Customer();
        customer3.firstName = "Anita";
        customer3.lastName = "Kumar";

        customer1.print();
        customer2.print();
        customer3.print();
    }
}
```


## Creating own constructors:

- In the main file, instead of passing it free and empty, can create your own constructor :
- In main file: `Customer customer = new Customer();` This Customer section has () empty brackets so it's free and empty. 
- Can change this:

- Add this code to the customer object file:
```java

Customer (String fName, String lName){
        firstName = fName ;
        lastName = lName ;
    }

```

- In main file - change that line to look like this:
`Customer customer = new Customer("Jyoti" , "Suresh");` but the `fname` and `lname` should also show in grey in the brackets. 

## File will finally look like this:

- Main file:


```java
public class OOPMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Jyoti" , "Suresh");
        customer.print();

    }
}


```

- Customer object file:

```java

public class Customer {
    String firstName;
    String lastName;
    Customer (String fName, String lName){ // Setting the new constructor
        firstName = fName ;
        lastName = lName ;
    }
    void print(){
        System.out.println("First Name: " + firstName + " Last Name: " + lastName);

    }
}
```


- Can reassign the values by using:
`customer.lastName = "Gosh";` (just setting different values to the same variables).