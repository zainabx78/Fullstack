package com.sparta.zf.oop;
import com.sparta.zf.oop.exercises.Animal;
import com.sparta.zf.oop.exercises.Cat;
import com.sparta.zf.oop.exercises.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnimalTests {

    @Test
    @DisplayName("getAge returns the correct age")
    public void getAgeTest(){
        // Arrange
        Animal cat = new Cat("Lily", 2015, 4, 19);
        // Act
        long result = cat.getAge();
        // Assert
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("getName returns the correct name")
    public void getFirstNameTest(){
        // Arrange
        Animal cat = new Cat("Lily", 2015, 4, 19);
        // Act
        String result = cat.getName();
        // Assert
        Assertions.assertEquals("Lily", result);
    }

    @Test
    @DisplayName("setNewName returns the new name given")
    public void setNewName(){

        // Arrange
        Animal cat = new Cat("Lily", 2015, 4, 19);

        //Act
        cat.setName("Julie");

        // Assert
        Assertions.assertEquals("Julie", cat.getName());

    }

    @Test
    @DisplayName("Testing the speak method")

    public void speak(){

        // Arrange
        Animal dog = new Dog("Baxter", 2015, 4, 19, "Catch");

        //Act
        String result = dog.speak();

        // Assert
        Assertions.assertEquals("Woof, woof!", result);

    }


    @Test
    @DisplayName("Testing the favourite game")
    public void game() {
        // Arrange
        Dog dog = new Dog("Baxter", 2015, 4, 19, "Catch");

        // Act
        String result = dog.getFavouriteGame();

        // Assert
        Assertions.assertEquals("Catch", result);
    }

}
