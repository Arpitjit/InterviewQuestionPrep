package com.arpit.prac.java.method.interfaces;


import java.time.LocalDate;
import java.util.*;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        // ...

        return 1;
    }

    public Calendar getBirthday() {
        return null;
    }

    public
   static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }


    static class PersonAgeComparator implements Comparator<Person> {
        public int compare(Person a, Person b) {
            return a.getBirthday().compareTo(b.getBirthday());
        }
    }


    public static void main(String args[]){

        Person person = new Person();
        Person person1 = new Person();

        Person person2 = new Person();

        Person person3 = new Person();

        Person person4 = new Person();

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(person);
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person1);

        PersonAgeComparator personAgeComparator = new PersonAgeComparator();


    Collections.sort(personArrayList,new PersonAgeComparator());


    Collections.sort(personArrayList, ((Person o1, Person o2) -> {

        return o1.getBirthday().compareTo(
                o2.getBirthday());
    }));

    Collections.sort(personArrayList, (a,b)->Person.compareByAge( a,  b));


    Collections.sort(personArrayList, Person::compareByAge);



    }



}

