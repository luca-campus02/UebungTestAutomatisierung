package org.campus02.test;

import org.campus02.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;
    Person person2;


    @BeforeEach
    void setUp() {
        person = new Person(
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
    void testConstructor() {
        Assertions.assertEquals("Luca",person.getFirstname());
        Assertions.assertEquals('M',person.getGender());
        Assertions.assertEquals("grün",person.getEyeColor());
        Assertions.assertEquals("Ronchetti",person.getLastname());
        Assertions.assertEquals(23,person.getAge());
        Assertions.assertEquals("AT",person.getCountry());
        Assertions.assertEquals(1337,person.getSalary());
        Assertions.assertEquals(175,person.getSize());
        Assertions.assertEquals(55,person.getWeight());

        Assertions.assertEquals("Lukas",person2.getFirstname());
        Assertions.assertEquals('F',person2.getGender());
        Assertions.assertEquals("undefined",person2.getEyeColor());
        Assertions.assertEquals("Ronehetti",person2.getLastname());
        Assertions.assertEquals(33,person2.getAge());
        Assertions.assertEquals("IT",person2.getCountry());
        Assertions.assertEquals(42069,person2.getSalary());
        Assertions.assertEquals(200,person2.getSize());
        Assertions.assertEquals(69,person2.getWeight());

    }
    @Test
    void setEyeColor() {
        person.setEyeColor("blau");
        Assertions.assertEquals("blau",person.getEyeColor());
        person.setEyeColor("grün");
        Assertions.assertEquals("grün",person.getEyeColor());
        person.setEyeColor("braun");
        Assertions.assertEquals("braun",person.getEyeColor());

        person.setEyeColor("randomstring123");
        Assertions.assertEquals("undefined",person.getEyeColor());
        person.setEyeColor("rot");
        Assertions.assertEquals("undefined",person.getEyeColor());
        person.setEyeColor("");
        Assertions.assertEquals("undefined",person.getEyeColor());

    }
}