package com.step.assignments.sets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetOperationsTest {

    HashSet<Object> firstSet = new HashSet<>();
    HashSet<Object> secondSet = new HashSet<>();

    Set<Integer> firstNumbersSet = new HashSet<>();
    Set<Integer> secondNumbersSet = new HashSet<>();
    Set<Character> firstCharactersSet = new HashSet<>();
    Set<Character> secondCharactersSet = new HashSet<>();

    @BeforeEach
    void setUp() {
        firstSet.add(1);
        firstSet.add(10);

        secondSet.add('a');
        secondSet.add('z');

        firstNumbersSet.add(1);
        firstNumbersSet.add(2);
        firstNumbersSet.add(3);

        secondNumbersSet.add(3);
        secondNumbersSet.add(4);
        secondNumbersSet.add(5);

        firstCharactersSet.add('a');
        firstCharactersSet.add('b');
        firstCharactersSet.add('c');

        secondCharactersSet.add('x');
        secondCharactersSet.add('y');
        secondCharactersSet.add('z');
    }


    @Test
    @DisplayName("should return all numbers of sets")
    void unionOfNumberSets(){
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        Set actual = SetOperations.union(firstNumbersSet, secondNumbersSet);

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("should return all characters of sets")
    void unionOfCharacterSets(){
        Set<Character> expected = new HashSet<>();
        expected.add('a');
        expected.add('b');
        expected.add('c');
        expected.add('x');
        expected.add('y');
        expected.add('z');

        Set actual = SetOperations.union(firstCharactersSet, secondCharactersSet);

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("should return all elements of sets")
    void unionOfSets(){
        Set<Object> expected = new HashSet<>();
        expected.add(1);
        expected.add(10);
        expected.add('a');
        expected.add('z');

        Set actual = SetOperations.union(firstSet, secondSet);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return common numbers of sets")
    void intersectionOfNumberSets(){
        Set<Integer> expected = new HashSet<>();
        expected.add(3);

        Set actual = SetOperations.intersection(firstNumbersSet, secondNumbersSet);
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("should return common characters of sets")
    void intersectionOfCharacterSets(){
        Set<Character> expected = new HashSet<>();

        Set actual = SetOperations.intersection(firstCharactersSet, secondCharactersSet);
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("should return difference of number sets")
    void differenceOfNumberSets(){
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);

        Set actual = SetOperations.difference(firstNumbersSet, secondNumbersSet);
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("should return difference of character sets")
    void differenceOfCharacterSets(){
        Set<Character> expected = new HashSet<>();
        expected.add('x');
        expected.add('y');
        expected.add('z');

        Set actual = SetOperations.difference(secondCharactersSet, firstCharactersSet);
        assertEquals(actual, expected);
    }

}