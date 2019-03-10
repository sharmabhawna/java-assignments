package com.step.assignments.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void shouldSetAndReturnTheFields(){
        SimpleCalculator simpleCalculator = new SimpleCalculator(25, 5);
        assertEquals(25.0, simpleCalculator.getFirstNumber());
        assertEquals(5.0, simpleCalculator.getSecondNumber());
        simpleCalculator.setFirstNumber(12);
        simpleCalculator.setSecondNumber(45);
        assertEquals(12.0, simpleCalculator.getFirstNumber());
        assertEquals(45.0, simpleCalculator.getSecondNumber());
    }

    SimpleCalculator simpleCalculator = new SimpleCalculator(25, 5);

    @Test
    void shouldReturnSum(){
        assertEquals(30, simpleCalculator.getSum());
    }

    @Test
    void shouldReturnDifference(){
        assertEquals(20, simpleCalculator.getDifference());
    }

    @Test
    void shouldReturnProduct(){
        assertEquals(125, simpleCalculator.getProduct());
    }

    @Test
    void shouldReturnQuotient(){
        assertEquals(5, simpleCalculator.getQuotient());
    }

    @Test
    void shouldReturnRemainder(){
        SimpleCalculator simpleCalculator = new SimpleCalculator(25, 3);
        assertEquals(1, simpleCalculator.getRemainder());
    }
}