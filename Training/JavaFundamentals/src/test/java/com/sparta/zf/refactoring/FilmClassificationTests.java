package com.sparta.zf.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationTests {
    @ParameterizedTest
    @ValueSource(ints = {1, 11})
    @DisplayName("getFilmClassification, when given an age range from 1 to 11, returns U and PG films ")
    public void getFilmClassificationFromAgeRange1To11_Return_UAndPGFilmsOnly(int age) {
        Assertions.assertEquals("U & PG films are available.", FilmClassification.getClassificationsByAge(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 14})
    @DisplayName("getFilmClassification, when given an age range from 12 to 14, returns U, PG and 12 films ")
    public void getFilmClassificationFromAgeRange12To14_Return_UAndPGAnd12FilmsOnly(int age) {
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassification.getClassificationsByAge(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 17})
    @DisplayName("getFilmClassification, when given an age range from 15 to 17, returns U, PG, 12 and 15 films ")
    public void getFilmClassificationFromAgeRange15To17_Return_UAndPGAnd12And15FilmsOnly(int age) {
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassification.getClassificationsByAge(age));
    }
}