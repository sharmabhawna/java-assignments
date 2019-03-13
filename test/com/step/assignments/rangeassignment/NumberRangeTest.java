package com.step.assignments.rangeassignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberRangeTest {

    Range numberRange = new NumberRange(5, 10);

    @Test
    @DisplayName("should return all the number within the range")
    void shouldReturnListOfNumbers(){
        List actual = Arrays.asList(5,6,7,8,9,10);
        assertEquals(actual, numberRange.getAll());
    }

    @Test
    @DisplayName("should return true if number lies within the range")
    void shouldReturnTrue(){
        assertEquals(true, numberRange.containsElement(7));
    }

    @Test
    @DisplayName("should return false if number does not lie within the range")
    void shouldReturnFalse(){
        assertEquals(false, numberRange.containsElement(50));
    }

}