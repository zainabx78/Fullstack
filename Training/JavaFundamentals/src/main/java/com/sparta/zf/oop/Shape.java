package com.sparta.zf.oop;

public abstract class Shape implements Printable {
    // When implementing an interface, you have to implement its methods too in the derived classes of the main abstract class.
    // Abstract classes can have concrete and abstract methods.


    // Concrete method (normal methods) with body.
    @Override
    public String toString(){
        return getClass().getName() + "Area: " + CalculateArea();

    }

    // Abstract methods do NOT have a method body
    // BUT derived classes from the abstract class MUST have their own implementation of the abstract methods from the base class.
    public abstract int CalculateArea();

}
