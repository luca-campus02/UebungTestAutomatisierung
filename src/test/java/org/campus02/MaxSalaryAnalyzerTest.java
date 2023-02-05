package org.campus02;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.*;

class MaxSalaryAnalyzerTest {
    PersonGenerator personGenerator = new PersonGenerator();
    MaxSalaryAnalyzer maxSalaryAnalyzer1 = new MaxSalaryAnalyzer();
    MaxSalaryAnalyzer maxSalaryAnalyzer2 = new MaxSalaryAnalyzer();

    @BeforeEach
    void setUp() {
        ArrayList<Person> persons1 = personGenerator.generatePersonList(1);
        ArrayList<Person> persons2 = personGenerator.generatePersonList(2);

        maxSalaryAnalyzer1.setPersons(persons1);
        maxSalaryAnalyzer2.setPersons(persons2);
    }



    @Test
    void analyze() {

        //persons1 test
        maxSalaryAnalyzer1.analyze();

        HashSet<Person> personsWithHighestSalary = maxSalaryAnalyzer1.getPersonsWithHighestSalary();
        Person personWithHighestSalary = new ArrayList<>(personsWithHighestSalary).get(0);

        Assertions.assertEquals(personGenerator.person2,personWithHighestSalary);
        Assertions.assertEquals(1,personsWithHighestSalary.size());

        //persons2 test
        maxSalaryAnalyzer2.analyze();

        HashSet<Person> personsWithHighestSalary2 = maxSalaryAnalyzer2.getPersonsWithHighestSalary();
        Assertions.assertEquals(3,personsWithHighestSalary2.size());
    }
}