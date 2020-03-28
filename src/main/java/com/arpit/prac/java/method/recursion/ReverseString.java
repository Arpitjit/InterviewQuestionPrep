package com.arpit.prac.java.method.recursion;

public class ReverseString {

    private static void printReverse(char [] str) {
        helper(0, str);
    }

    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }

    public static void main(String[] args) {

        String input = "Reverse this String.";
        printReverse(input.toCharArray());
    }
}
