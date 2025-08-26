# Encapsulation

- Encapsulation = Wrapping data (variables) and methods (functions) together inside one unit (class) AND controlling access to them.
- Data and parts are inside, not directly accessible.
- Instance variables should be private, methods should be public!

## Using code from abstraction section
- Can use `private` infront of different instances/methods - but then can't access them in the main file anymore. 
- In the customer object file:
E.g. before private:

```java

public class Customer {
    String firstName;
    String lastName;
    Customer (String fName, String lName){
        firstName = fName ;
        lastName = lName ;
    }
    void print(){
        System.out.println("First Name: " + firstName + " Last Name: " + lastName);

    }
}
```

After private:

```java
public class Customer {
    private String firstName;
    private String lastName;
    public Customer (String fName, String lName){
        firstName = fName ;
        lastName = lName ;
    }
    public void print(){
        System.out.println("First Name: " + firstName + " Last Name: " + lastName);

    }
}
```

- To target the problem of being unable to access private things: use accessor functions (get or change value) or getters and setters:

## Getters and setters:

- In customer file:
- Right click on the instance variable (lastName and firstName).
- Generate --> getters and setters --> shift click both options below and press `ok`. 

- The code now looks like this in the customers file:

```java

public class Customer {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;
    public Customer (String fName, String lName){
        firstName = fName ;
        lastName = lName ;
    }
    public void print(){
        System.out.println("First Name: " + firstName + " Last Name: " + lastName);

    }
}

```

**Main file:**
- Uses `setLastName` instead.
- Difference is that I can choose to put limits and restrictions on the variable (e.g. which last names you could use ) etc .

```java

public class OOPMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Jyoti" , "Suresh");
        customer.setLastName("Gosh");
        customer.print();

    }
}

```