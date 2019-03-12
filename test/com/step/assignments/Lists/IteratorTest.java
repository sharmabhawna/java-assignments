package com.step.assignments.Lists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    @Test
    @DisplayName("should return true when there is next element")
    void hasNext() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        Iterator iterator = new Iterator(list);
        assertTrue(iterator.hasNext());

        List<Integer> numbers = new LinkedList<Integer>();
        numbers.add(2);
        Iterator numbersIterator = new Iterator(numbers);
        assertTrue(numbersIterator.hasNext());
    }

    @Test
    @DisplayName("should return false when there is no next element")
    void hasNext1() {
        List<Integer> list = new ArrayList<Integer>();
        Iterator iterator = new Iterator(list);
        assertFalse(iterator.hasNext());

        List<Integer> numbers = new LinkedList<Integer>();
        Iterator numbersIterator = new Iterator(numbers);
        assertFalse(numbersIterator.hasNext());
    }

    @Test
    @DisplayName("should return value of next element")
    void next() {
        List<Integer> list = new ArrayList<Integer>();
        Integer integer = 1;
        list.add(integer);
        Iterator iterator = new Iterator(list);
        assertEquals(integer,iterator.next());

        List<Integer> numbers = new LinkedList<Integer>();
        Integer number = 1;
        numbers.add(number);
        Iterator numbersIterator = new Iterator(numbers);
        assertEquals(number, numbersIterator.next());
    }

//    @Test
//    @DisplayName("should return the integer when there is next element")
//    void next1() {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        Iterator iterator = new Iterator(list);
//    }

}