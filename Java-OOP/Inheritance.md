# Inheritance

Inheritance = One class (child) can use the properties and methods of another class (parent).

### Real-life Analogy

- Car (Parent Class) = Has basic features (start, stop).

- SportsCar (Child Class) = Inherits those features and adds extra ones (turbo boost).


## Inheritance in java:
**- 1 main superclass**
  - To create this, just right click on src folder and create a new class like normal and name it `Person`. 
**- 2 subclasses:** employees and customers.
  - In the customer file - first line needs to include the superclass name to connect it to it. 
    - `public class Customer extends Person {` - add `extends Person` (Person is the superclass.)
    - Move all the code into the Person superclass: right click anywhere in code object customer file, refactor, move up, select all. 

- Create another class - employee class. 
- Same first line as customer class - `public class Employee extends Person {` - might see error just resolve by clicking on `create constructor matching super` (uses same constructor). 
- Add the employee details to main file too. 



# FINAL CODE:


--> Prints out employee first and last name, customer first name, last name and also their city/delivery Address. 
1. MAIN FILE:

```java

public class OOPMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Jyoti" , "Suresh", "Mumbai");
        customer.setLastName("Gosh");
        customer.print();
        Employee employee = new Employee("Minato", "Fujiwara");
        employee.print();
    }
}
```

2. SUPERCLASS - Person

```java
public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String fName, String lName) {
        firstName = fName ;
        lastName = lName ;
    }

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

    public void print(){
        System.out.println("First Name: " + firstName + " Last Name: " + lastName);

    }
}

```

3. Subclass --> customer

```java
public class Customer extends Person {

    public String getDeliveryAddress (){
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress){
        this.deliveryAddress = deliveryAddress;
    }

    private String deliveryAddress;

    public Customer (String fName, String lName, String dAddress){
        super(fName, lName);
        deliveryAddress = dAddress;
    }

    public void print(){
        System.out.print("Delivery Address: " + deliveryAddress + ", ");
        super.print();
    }
}
```

4. Subclass --> Employee

```java

public class Employee extends Person {
    private String department;
    public Employee(String fName, String lName) {
        super(fName, lName);
    }
}


```