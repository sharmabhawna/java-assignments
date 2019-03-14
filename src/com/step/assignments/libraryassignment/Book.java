package com.step.assignments.libraryassignment;

public class Book {

    private String name;
    private boolean isBorrowed;

    public Book(String name) {
        this.name = name;
        this.isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook(){
        this.isBorrowed = true;
    }

    public void returnBook(){
        this.isBorrowed = false;
    }
}
