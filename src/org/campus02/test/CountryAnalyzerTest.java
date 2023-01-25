package org.campus02.test;

import org.campus02.CountryAnalyzer;
import org.campus02.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountryAnalyzerTest {

    PersonGenerator personGenerator = new PersonGenerator();
    CountryAnalyzer countryAnalyzer1 = new CountryAnalyzer();
    CountryAnalyzer countryAnalyzer2 = new CountryAnalyzer();


    @BeforeEach
    void setUp() {
        ArrayList<Person> persons1 = personGenerator.generatePersonList(1);
        ArrayList<Person> persons2 = personGenerator.generatePersonList(2);

        countryAnalyzer1.setPersons(persons1);
        countryAnalyzer2.setPersons(persons2);
        persons2.add(personGenerator.person2);
        persons2.add(personGenerator.person2);
    }

    @Test
    void analyze() {

        //persons1 test
        countryAnalyzer1.analyze();

        HashMap<String, Integer> countryAnalyzerResultHashMap1 = countryAnalyzer1.getResult();
        Assertions.assertEquals(2,countryAnalyzerResultHashMap1.get("AT"));
        Assertions.assertEquals(1,countryAnalyzerResultHashMap1.get("IT"));


        //persons2 test
        countryAnalyzer2.analyze();

        HashMap<String, Integer> countryAnalyzerResultHashMap2 = countryAnalyzer2.getResult();
        Assertions.assertEquals(3,countryAnalyzerResultHashMap2.get("AT"));
        Assertions.assertEquals(1,countryAnalyzerResultHashMap2.get("DE"));
        Assertions.assertEquals(2,countryAnalyzerResultHashMap2.get("IT"));
    }
}