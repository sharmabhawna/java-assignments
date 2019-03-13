package com.step.assignments.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {

    @Test
    void shouldReturnArea(){
        Wall wall = new Wall(20, 10);
        assertEquals(200, wall.getArea());

        Wall wall1 = new Wall();
        wall1.setHeight(20);
        wall1.setWidth(-5);
        assertEquals(0, wall1.getArea());

        Wall wall2 = new Wall();
        wall2.setHeight(-5);
        wall2.setWidth(10);
        assertEquals(0, wall2.getArea());
    }

}