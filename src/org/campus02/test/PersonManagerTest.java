package org.campus02.test;

import org.campus02.Person;
import org.campus02.PersonManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonManagerTest {

    Person person1;
    Person person2;



    @BeforeEach
    void setUp() {

        person1 = new Person(
                "Luca",
                "Ronchetti",
                'M',
                23,
                "AT",
                1337,
                "grün",
                55,
                175);

        person2 = new Person(
                "Lukas",
                "Ronehetti",
                'F',
                33,
                "IT",
                42069,
                "rot",
                69,
                200);


    }

    @Test
    void addPerson() {
        PersonManager personManager = new PersonManager();
        Assertions.assertEquals(0,personManager.getPersons().size());
        personManager.addPerson(person1);
        Assertions.assertEquals(1,personManager.getPersons().size());
        personManager.addPerson(person2);
        Assertions.assertEquals(2,personManager.getPersons().size());
        personManager.addPerson(person1);
        Assertions.assertEquals(3,personManager.getPersons().size());
    }
}