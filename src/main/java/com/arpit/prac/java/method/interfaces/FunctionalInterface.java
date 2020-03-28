package com.arpit.prac.java.method.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class FunctionalInterface {


    public static void main(String args[]) {

        // create a list of strings
        List<String> names =
                Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s) -> s.startsWith("G");

        for (String name:names
             ) {

            if(p.test(name)){
                System.out.println(name);
            }

        }


        BinaryOperator<String> s = ((s1, s2) -> {return s1;});

        System.out.println(s.apply("arpit", "vineet"));



    }

}
