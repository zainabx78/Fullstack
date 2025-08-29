package com.sparta.zf.oop.exercises;

public class Dog extends Animal {
    private String favouriteGame;

    public Dog(String name, int year, int month, int day, String favouriteGame) {
        super(name, year, month, day);
        this.favouriteGame = favouriteGame;
    }

    // Getters and setters
    public String getFavouriteGame() {
        return favouriteGame;
    }

    public void setFavouriteGame(String favouriteGame) {
        this.favouriteGame = favouriteGame;
    }


    @Override
    public String speak() {
        return "Woof, woof!";
    }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "', age=" + getAge() + ", favouriteGame='" + favouriteGame + "'}";
    }
}
