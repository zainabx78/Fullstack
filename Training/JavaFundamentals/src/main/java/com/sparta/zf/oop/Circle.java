package com.sparta.zf.oop;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public int CalculateArea() {
        return (int)(Math.PI * radius * radius);
    }

    @Override
    public void print() {
        System.out.println(CalculateArea());
    }
}
