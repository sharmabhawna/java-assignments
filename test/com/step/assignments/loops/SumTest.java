package com.step.assignments.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void shouldReturnSumOfDigits(){
        assertEquals(6, Sum.sumDigits(123));
        assertEquals(8, Sum.sumDigits(125));
    }

    @Test
    void shouldReturnSumOfFirstAndLastDigit(){
        assertEquals(0, Sum.sumFirstAndLastDigit(0));
        assertEquals(6, Sum.sumFirstAndLastDigit(3));
        assertEquals(4, Sum.sumFirstAndLastDigit(22));
        assertEquals(6, Sum.sumFirstAndLastDigit(214));
        assertEquals(10, Sum.sumFirstAndLastDigit(2328));
    }

    @Test
    void shouldReturnSumOfEvenDigits(){
        assertEquals(0, Sum.sumEvenDigits(1));
        assertEquals(2, Sum.sumEvenDigits(2));
        assertEquals(0, Sum.sumEvenDigits(13));
        assertEquals(4, Sum.sumEvenDigits(14));
        assertEquals(4, Sum.sumEvenDigits(41));
        assertEquals(0, Sum.sumEvenDigits(135));
        assertEquals(6, Sum.sumEvenDigits(165));
    }

}