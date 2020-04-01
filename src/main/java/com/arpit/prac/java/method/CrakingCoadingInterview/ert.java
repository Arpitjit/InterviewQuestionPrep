package com.arpit.prac.java.method.CrakingCoadingInterview;

public class ert {

    int convertfive(int num) {

        String num_string = num+"";

        char [] array = num_string.toCharArray();

        int i=0;

        for(Character character: array){

            if('0' == (character)){
                array[i] = '5';
            }

            i++;
        }



        return Integer.parseInt(new String(array));

        // Your code here
    }

    public static void main(String[] args) {
        ert ert = new ert();

        ert.convertfive(1005);
    }
}
