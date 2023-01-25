package org.campus02.test;

import org.campus02.Person;
import org.campus02.PersonManager;

import java.util.ArrayList;

public class PersonGenerator {

    Person person1 = new Person(
                "Luca",
                        "Ronchetti",
                        'M',
                        23,
                        "AT",
                        1337,
                        "grün",
                        55,
                        175);

    Person person2 = new Person(
                "Lukas",
                        "Ronehetti",
                        'F',
                        33,
                        "IT",
                        42069,
                        "rot",
                        69,
                        200);

    Person person3 = new Person(
                "Luka",
                        "Soletti",
                        'M',
                        42,
                        "DE",
                        1337,
                        "blau",
                        22,
                        185);

    Person person4 = new Person(
                "Lucas",
                        "Soletti",
                        'M',
                        24,
                        "AT",
                        1337,
                        "grün",
                        99,
                        180);

    Person person0 = new Person(
                "Luca",
                        "Nichtronchetti",
                        'F',
                        23,
                        "AT",
                        420,
                        "grün",
                        42,
                        185);

        ArrayList<Person> persons1 = new ArrayList<>();

        ArrayList<Person> persons2 = new ArrayList<>();




        public ArrayList<Person> generatePersonList(int listNumber){
            if(listNumber == 1){
                persons1.add(person1);
                persons1.add(person2);
                persons1.add(person0);
                return persons1;
            }
            else{
                persons2.add(person1);
                persons2.add(person3);
                persons2.add(person4);
                persons2.add(person0);
                return persons2;
            }
        }


}
