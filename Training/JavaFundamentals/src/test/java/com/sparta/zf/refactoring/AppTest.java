package com.sparta.zf.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @Test
    @DisplayName("getGreeting, when given a time of 6, returns good morning")
    public void getGreeting_GivenATimeOf6_ReturnsGoodMorning(){
        // Arrange
        int time =6;
        String expected = "Good Morning!";

        //Act
        String actual = App.getGreeting(time);

        //Assert

        Assertions.assertEquals(expected, actual);

    }

    @Test
    @DisplayName("getGreeting, when given a time of 14, returns good afternoon")
    public void getGreeting_GivenATimeOf14_ReturnsGoodAfternoon(){
        Assertions.assertEquals("Good Afternoon!", App.getGreeting(14));
    }


    // Parameterized testing

    @ParameterizedTest
    @ValueSource(ints = {0, 4})
    @DisplayName("getGreeting, when given a time from 0 to 4, returns good evening ")
    public void getGreeting_GiveATimeFrom0To4_ReturningGoodEvening(int time){
        Assertions.assertEquals("Good Evening!", App.getGreeting(time));
    }


    @ParameterizedTest
    @ValueSource(ints = {5, 11})
    @DisplayName("getGreeting, when given a time from 5 to 11, returns good morning ")
    public void getGreeting_GiveATimeFrom5To11_ReturningGoodMorning(int time){
        Assertions.assertEquals("Good Morning!", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 18})
    @DisplayName("getGreeting, when given a time from 12 to 18, returns good afternoon ")
    public void getGreeting_GiveATimeFrom12To18_ReturningGoodAfternoon(int time){
        Assertions.assertEquals("Good Afternoon!", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 12, 19, 23})
    @DisplayName("getGreeting, when given a time from 19 to 23, returns good evening ")
    public void getGreeting_GiveATimeFrom19To23_ReturningGoodEvening(int time){
        Assertions.assertEquals("Good Evening!", App.getGreeting(time));
    }


    @ParameterizedTest
    @CsvSource ({
            "Good Evening!, 2",
            "Good Morning!, 8",
            "Good Afternoon!, 15",
            "Good Evening, 21"
    })
    @DisplayName("getGreeting, when given a time, returns an appropriate greeting")
    public void givenATime_Greeting_ReturnsAnAppropriateGreeting(String expected, int time){
        Assertions.assertEquals(expected, App.getGreeting(time));

    }

}
