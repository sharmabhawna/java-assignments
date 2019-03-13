package com.step.assignments.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void shouldReturnDistanceFromOrigin(){
        Point point = new Point(3,4);
        assertEquals(5, point.Distance());
    }

    @Test
    void shouldReturnDistanceFromCoordinate(){
        Point point = new Point(6,5);
        assertEquals(5, point.Distance(2,2));
    }

    @Test
    void shouldReturnDistanceFromPoint(){
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        assertEquals(5, first.Distance(second));
    }
}