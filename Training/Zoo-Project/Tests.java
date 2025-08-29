package com.sparta.zf.zoo;

import com.sparta.zf.oop.exercises.Animal;
import com.sparta.zf.oop.exercises.Dog;
import com.sparta.zf.oop.zoo.Lion;
import com.sparta.zf.oop.zoo.Zookeeper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnimalTests {

    @Test
    @DisplayName("Testing the Lion's Name")
    public void nameLion() {
        // Arrange
        Lion lion = new Lion("Sam", 2020, 2, 1);

        // Act
        String result = lion.getName();

        // Assert
        Assertions.assertEquals("Sam", result);
    }


    @Test
    @DisplayName("Testing the Lion's Birthdate")
    public void dobLion() {
        // Arrange
        Lion lion = new Lion("Sam", 2020, 2, 1);

        // Act
        String result = lion.getBirthdate();

        // Assert
        Assertions.assertEquals("2020-02-01", result);
    }


    @Test
    @DisplayName("Testing the Lion's response")
    public void responseLion() {
        // Arrange
        Lion lion = new Lion("Sam", 2020, 2, 1);

        // Act
        String result = lion.speak();

        // Assert
        Assertions.assertEquals(("I'm the lion, " + lion.getName() + " I was born on: " + lion.getBirthdate()), result);
    }


    @Test
    @DisplayName("Testing the Zookeeper's name")
    public void nameZookeeper() {
        // Arrange
        Zookeeper zookeeper1 = new Zookeeper("Zainab", 2022, 2, 1, "Lions");

        // Act
        String result = zookeeper1.getStaffName();

        // Assert
        Assertions.assertEquals("Zainab", result);
    }

    @Test
    @DisplayName("Testing the Zookeeper's response")
    public void responseZookeeper() {
        // Arrange
        Zookeeper zookeeper1 = new Zookeeper("Zainab", 2022, 2, 1, "Lions");

        // Act
        String result = zookeeper1.speak();

        // Assert
        Assertions.assertEquals(("Hello, I'm " + zookeeper1.getStaffName() + " from the zoo staff"), result);
    }








}