package com.arpit.prac.java.method.CrakingCoadingInterview;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindroneInString {

    public String longestPalindrome(String s) {

        if(null == s){
            return "";
        }

        if(s.length()<2){
            return s;
        }

        Deque<Character> stack = new ArrayDeque<Character>();




        char [] char_array = s.toCharArray();

        stack.push(char_array[0]);

        StringBuffer string = new StringBuffer();

        for(int i=1; i< char_array.length;i++){

            if(!stack.isEmpty() && stack.peek().equals(char_array[i])){

                string.append(char_array[i]).append(stack.pop());


            } else if(stack.size() >= 2) {

                Character pop1 = stack.pop();
                Character pop2 = stack.pop();

                if(pop2.equals(char_array[i])){
                    string.append(char_array[i]).append(pop1).append(pop2);

                }else {
                    stack.push(pop2);
                    stack.push(pop1);
                    stack.push(char_array[i]);

                }

            }else {
                stack.push(char_array[i]);
            }


        }



        if(string.length()==0){
            string.append(char_array[0]);
        }
        return string.toString();

    }

    public static void main(String[] args) {
        String str = "abba";

       /* PalindroneInString palindroneInString = new PalindroneInString();
        palindroneInString.longestPalindrome(str);
        */

        char [] s = {'5', '5'};

       Integer i =  Integer.parseInt(new String(s));
        System.out.println(i);

    }
}
