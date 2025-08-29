package com.sparta.zf.oop;

public class Rectangle extends Shape{

    private int length;

    private int width;

    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }


    @Override
    public int CalculateArea() {
        return length * width;
    }

    @Override
    public void print() {
        System.out.println(CalculateArea());
    }
}
