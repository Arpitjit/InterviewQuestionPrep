package com.arpit.prac.java.method.CrakingCoadingInterview;

import java.util.HashSet;

public class UniqueueCharacters {


    public static void main(String[] args) {

        String test = "abca";

        UniqueueCharacters uniqueueCharacters = new UniqueueCharacters();

        System.out.println(uniqueueCharacters.isUniqueChars2(test));
    }

    private boolean findUnique(String test) {

        char [] chars = test.toCharArray();

        HashSet<Character> uniqueueChars = new HashSet<>(chars.length);

        for (Character c:chars) {
            if(uniqueueChars.contains(c)){
                System.out.println(c);

                return false;
            } else {
               uniqueueChars.add(c);
            }


        }
        return true;

    }


    public boolean isUniqueChars2(String input){


        boolean asciiArray [] = new boolean[256];

        for (Character c :input.toCharArray()) {

            if(asciiArray[c]){
                return false;
            }else {
                asciiArray[c] = true;
            }

        }

        return true;

    }


    public boolean isUniqueBitManipulaton(String s){

        int checker = 0;

        for(Character c: s.toCharArray()){

            int val  = c - 'a';

            if((checker & (1 << val)) > 0)
                return false;
            checker |= (1 << val);

        }

        return true;
    }
}
