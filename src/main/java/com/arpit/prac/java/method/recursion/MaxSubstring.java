package com.arpit.prac.java.method.recursion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MaxSubstring {

    public int lengthOfLongestSubstring(String s) {

        int staticPointer = 0;
        int movingPointer = 0;
        int maxLength = 0;

        HashSet<Character> window = new HashSet<>();

        while(movingPointer<s.length()){

            if(!window.contains(s.charAt(movingPointer))){
                window.add(s.charAt(movingPointer));
                movingPointer++;

                maxLength = Math.max(window.size(), maxLength);
                printSet(window);


            } else {
                printSet(window);

                window.remove(s.charAt(staticPointer));
                staticPointer++;
            }


        }

        System.out.println("Final");
        printSet(window);


        return maxLength;



    }

    private void printSet(HashSet<Character> window) {
        System.out.println();
        for (Character st:window
             ) {
            System.out.print(st);
        }
        System.out.println();

    }


    public static void main(String[] args) {
        MaxSubstring maxSubstring = new MaxSubstring();

        System.out.println(maxSubstring.lengthOfLongestSubstring("abcabcbb"));
    }
}
