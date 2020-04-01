package com.arpit.prac.java.method.CrakingCoadingInterview;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();

        reverseString.reverse("abcd#");

        System.out.println();
    }

    private String reverse(String s) {


        char [] array = s.toCharArray();
        int i=0;

        int j = s.length()-2;

        while (i<j){

            char currentChar = s.charAt(i);

            array[i] = array[j];

            array[j] = currentChar;
            i++;
            j--;

        }


        for (Character m:array) {
            System.out.println(m);

        }



        return array.toString();
    }
}
