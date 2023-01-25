package org.campus02.test;

import org.campus02.GenderAnalyzer;
import org.campus02.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GenderAnalyzerTest {

    PersonGenerator personGenerator = new PersonGenerator();
    GenderAnalyzer genderAnalyzer1 = new GenderAnalyzer();
    GenderAnalyzer genderAnalyzer2 = new GenderAnalyzer();


    @BeforeEach
    void setUp() {

        ArrayList<Person> persons1 = personGenerator.generatePersonList(1);
        ArrayList<Person> persons2 = personGenerator.generatePersonList(2);

        genderAnalyzer1.setPersons(persons1);
        genderAnalyzer2.setPersons(persons2);
    }

    /**
     * Test the result of avgM and avgW
     */
    @Test
    void analyze() {

        //persons1 test
        genderAnalyzer1.analyze();

        Assertions.assertEquals(175,genderAnalyzer1.getAvgM());
        Assertions.assertEquals(192.5,genderAnalyzer1.getAvgW());


        //persons2 test
        genderAnalyzer2.analyze();

        Assertions.assertEquals(180,genderAnalyzer2.getAvgM());
        Assertions.assertEquals(185,genderAnalyzer2.getAvgW());


    }
}