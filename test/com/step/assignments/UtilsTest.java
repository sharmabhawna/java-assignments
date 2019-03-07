package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilsTest {

    @Test
    void shouldReturnReverseNumber(){
        assertEquals(123, Utils.reverse(321));
        assertEquals(321, Utils.reverse(123));
        assertEquals(87, Utils.reverse(78));
        assertEquals(67, Utils.reverse(76));
        assertEquals(7, Utils.reverse(7));
    }

    @Test
    void shouldReturnReverseText(){
        assertEquals("D C B A", Utils.reverse("A B C D"));
        assertEquals("text some is This", Utils.reverse("This is some text"));
        assertEquals("text more Some", Utils.reverse("Some more text"));
    }
}