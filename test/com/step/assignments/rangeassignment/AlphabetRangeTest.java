package com.step.assignments.rangeassignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlphabetRangeTest {

    Range alphabetRange = new AlphabetRange('d', 'l');

    @Test
    @DisplayName("should return all the alphabets between given alphabets")
    void shouldReturnListOfAlphabets(){
        List alphabets = Arrays.asList('d','e','f','g','h','i','j','k','l');
        assertEquals(alphabets, alphabetRange.getAll());
    }

    @Test
    @DisplayName("should return true if alphabet lies between the series")
    void shouldReturnTrue(){
        assertEquals(true, alphabetRange.containsElement('i'));
    }

    @Test
    @DisplayName("should return false if alphabet does not lie within the series")
    void shouldReturnFalse(){
        assertEquals(false, alphabetRange.containsElement('x'));
    }

}