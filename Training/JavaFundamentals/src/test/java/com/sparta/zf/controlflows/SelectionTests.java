package com.sparta.zf.controlflows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SelectionTests {

    // Running tests for conditional operator method:
    // getGradeConditionalOperators tests

    @ParameterizedTest
    @ValueSource(ints = {0, 64})
    public void givenAGradeOf0Or64_getGradeConditionalOperators_ReturnFail(int grade){
        Assertions.assertEquals("Fail", Selection.getGradeConditionalOperators(grade));
    }

    @ParameterizedTest
    @ValueSource(ints = {65, 84})
    public void givenAGradeOf65Or84_getGradeConditionalOperators_ReturnPass(int grade){
        Assertions.assertEquals("Pass", Selection.getGradeConditionalOperators(grade));
    }

    @Test
    @DisplayName("Test getGradeConditionalOperators with 85")
    public void givenAGradeOf85_getGradeConditionalOperators_ReturnDistinction(){
        Assertions.assertEquals("Distinction", Selection.getGradeConditionalOperators(85));
    }


    // Running tests for switch statement method:

    @Test
    @DisplayName("Test the switch statement")
    public void testSwitchStatement1(){
        //Arrange
        int code = 1;
        String expected = "Code Amber";

        //Act
        String result = Selection.priority(code);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test the switch statement")
    public void testSwitchStatement2(){
        //Arrange
        int code = 2;
        String expected = "Code Amber";

        //Act
        String result = Selection.priority(code);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test getPriority with 3")
    public void givenAPriorityOf3_getPriority_ReturnCodeRed(){
        Assertions.assertEquals("Code Red", Selection.priority(3));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 99})
    public void givenAPriorityOf4To99_getPriority_ReturnError(int level){
        Assertions.assertEquals("error", Selection.priority(level));
    }


}
