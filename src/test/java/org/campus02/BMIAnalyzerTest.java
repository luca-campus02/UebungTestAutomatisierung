package org.campus02;

import java.util.ArrayList;

import org.junit.jupiter.api.*;

class BMIAnalyzerTest {
    PersonGenerator personGenerator = new PersonGenerator();
    BMIAnalyzer bmiAnalyzer1 = new BMIAnalyzer();
    BMIAnalyzer bmiAnalyzer2 = new BMIAnalyzer();

    @BeforeEach
    void setUp() {

        ArrayList<Person> persons1 = personGenerator.generatePersonList(1);
        ArrayList<Person> persons2 = personGenerator.generatePersonList(2);

        bmiAnalyzer1.setPersons(persons1);
        bmiAnalyzer2.setPersons(persons2);
    }

    @Test
    void calcBmi() {

        Assertions.assertEquals(17.959183673469387755102040816327,bmiAnalyzer1.calcBmi(personGenerator.person1));
        Assertions.assertEquals(17.25,bmiAnalyzer1.calcBmi(personGenerator.person2));

    }


    @Test
    void analyze() {
        bmiAnalyzer1.analyze();
        ArrayList<Pair<Person, Double>> bmiAnalyzerResult1 = bmiAnalyzer1.getResult();
        double bmiAnalyzerResult1firstEntry = bmiAnalyzerResult1.get(0).getValue();
        Assertions.assertEquals(17.959183673469387755102040816327,bmiAnalyzerResult1firstEntry);

        bmiAnalyzer2.analyze();
        ArrayList<Pair<Person, Double>> bmiAnalyzerResult2 = bmiAnalyzer2.getResult();
        double bmiAnalyzerResult2firstEntry = bmiAnalyzerResult2.get(1).getValue();
        Assertions.assertEquals(6.4280496712929145361577794010226,bmiAnalyzerResult2firstEntry);

    }
}