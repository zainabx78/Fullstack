# Polymorphism 

- Get a message - do something.
- E.g. running the object start` but different things will start differently but with the same object.
- Makes code more flexible and maintainable
- Enables code reusability


## Polymorphism in Java:

- The code used in main file for inheritance:
- both customer and employee use print method (same job but executes differently). --> polymorphism

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