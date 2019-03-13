package com.step.assignments.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void shouldSetAndReturnFields(){
        Person person = new Person();
        person.setFirstName("Bhawna");
        person.setLastName("Sharma");
        person.setAge(22);
        assertEquals("Bhawna", person.getFirstName());
        assertEquals("Sharma", person.getLastName());
        assertEquals(22, person.getAge());

        person.setFirstName("");
        person.setLastName("");
        person.setAge(101);
        assertEquals("", person.getFirstName());
        assertEquals("", person.getLastName());
        assertEquals(0, person.getAge());
    }

    @Test
    void shouldReturnFullName(){
        Person person = new Person();
        person.setFirstName("Bhawna");
        person.setLastName("Sharma");
        assertEquals("Bhawna Sharma", person.getFullName());

        person.setFirstName("Bhawna");
        person.setLastName("");
        assertEquals("Bhawna", person.getFullName());

        person.setFirstName("");
        person.setLastName("Sharma");
        assertEquals("Sharma", person.getFullName());

        person.setFirstName("");
        person.setLastName("");
        assertEquals("", person.getFullName());
    }

    @Test
    void shouldReturnTrueForTeenAge(){
        Person person = new Person();
        person.setAge(15);
        assertEquals(true, person.isTeen());

        person.setAge(25);
        assertEquals(false, person.isTeen());

        person.setAge(101);
        assertEquals(false, person.isTeen());
    }
}