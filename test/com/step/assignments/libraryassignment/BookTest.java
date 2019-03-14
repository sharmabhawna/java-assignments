package com.step.assignments.libraryassignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("should return true if book is borrowed")
    void isBorrowed(){
        Book shadowOfTheWind = new Book("The shadow of the wind");
        shadowOfTheWind.borrowBook();
        assertTrue(shadowOfTheWind.isBorrowed());
    }

    @Test
    @DisplayName("should return false if book is not borrowed")
    void isNotBorrowed(){
        Book shadowOfTheWind = new Book("The shadow of the wind");
        assertFalse(shadowOfTheWind.isBorrowed());

        Book kiteRunner = new Book("The kite runner");
        kiteRunner.borrowBook();
        kiteRunner.returnBook();
        assertFalse(kiteRunner.isBorrowed());
    }

    @Test
    @DisplayName("should return false if book has been returned")
    void isReturned(){
        Book kiteRunner = new Book("The kite runner");
        kiteRunner.borrowBook();
        kiteRunner.returnBook();
        assertFalse(kiteRunner.isBorrowed());
    }

}