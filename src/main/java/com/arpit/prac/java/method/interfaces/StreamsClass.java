package com.arpit.prac.java.method.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsClass {

    public static void main(String[] args) {
        int sum = Arrays.stream(new int[]{1, 2, 3})
                .filter(i -> i>1)
                .map(i -> i*3)
                .sum();


        ArrayList<String> arry = new ArrayList<>();
        arry.add("1");
        arry.add("2");
        arry.add("3");
        arry.add("4");
        arry.add("5");
        arry.add("6");
        arry.add("7");
        arry.add("9");
        arry.add("10");
        arry.add("11");
        arry.add("12");
        arry.add("13");


        Stream<Integer> str = Stream.of("1", "2", "3", "4")
                .map(Integer::new);










      Stream<String> stringStream = arry.parallelStream();
 Integer in = stringStream
        .filter((a)->{ return !a.equals(null);})
        .map((i) -> {return  Integer.parseInt(i);})
         .peek(s -> {System.out.println(s);})
        .reduce(0,  Integer::sum );

        System.out.println("ans is:: "+ in);







        // System.out.println("sum :  "+ sum);

    }
}
