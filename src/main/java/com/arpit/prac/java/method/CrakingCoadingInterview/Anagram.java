package com.arpit.prac.java.method.CrakingCoadingInterview;

import java.util.HashMap;
import java.util.HashSet;

public class Anagram {

    public static void main(String[] args) {
        Anagram anagram =  new Anagram();

        System.out.println(anagram.checkAgain("dddatrpitatdddddd", "tripaa"));
    }




    public boolean checkAgain(String s1, String s2){

        int [] array = new int[256];
        int [] array2 = new int[256];


        // If both strings are of different length.
        // Removing this condition will make the program
        // fail for strings like "aaca" and "aca"
        if (s1.length() != s2.length())
            return false;


        for (int i = 0; i < s1.length() && i < s2.length();
             i++) {
            array[s1.charAt(i)]++;
            array2[s2.charAt(i)]++;
        }



        // Compare count arrays
        for (int i = 0; i < 256; i++)
            if (array[i] != array2[i])
                return false;


        return true;




    }






    private boolean check(String s1, String s2) {



        if(null ==s1 ){
            return false;
        }

        if(null ==s2 ){
            return false;
        }


        if(s1.length()  != s2.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c: s1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();

        for(Character c: s2.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }

        if(map.keySet().size() != map2.keySet().size()){
            return  false;
        }

        for(Character character: map.keySet()){
            if(map2.get(character) != map.get(character)){
                return false;
            }
        }


        return true;



    }
}
