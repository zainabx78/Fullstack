package com.sparta.zf.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;

public class AppTest {

//    @Test
//    @DisplayName("My First Test")
//    public void firstTest() {
//        Assertions.assertTrue(false);
//
//    }


    @Test
    @DisplayName("getGreeting, when given a time of 21, returns good evening")
    public void getGreeting_GivenATimeOf21_ReturnsGoodEvening(){
        // Arrange
        int time = 21;
        String expected = "Good Evening!";

        //Act
        String actual = App.getGreeting(time);

        //Assert

        Assertions.assertEquals(expected, actual);

    }
}
