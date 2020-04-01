package com.arpit.prac.java.method.CrakingCoadingInterview;

import java.util.StringTokenizer;

public class ReplaceSpaces {

    public static void main(String[] args) {
        ReplaceSpaces replaceSpaces = new ReplaceSpaces();

        System.out.println(replaceSpaces.replaceAlgo("this is my name "));
    }

    private char[] replaceAlgo(String string) {

        //find the number of spaces\

        int MAX = 1000;

        final Character SPACE = ' ';
        char [] array = string.toCharArray();
        int spaceCount = 0;
        for (Character c:array) {
            if(SPACE.equals(c)) {
                spaceCount++;
            }
        }

        int i =string.length();

        // count spaces and find current length
        while (array[i - 1] == ' ')
        {
            spaceCount--;
            i--;
        }

        int new_lenght = spaceCount*2+ i;

        if(new_lenght>MAX) return array;

        // Start filling character from end
        int index = new_lenght - 1;


        char[] new_str = string.toCharArray();
        char [] str = new char[new_lenght];

        // Fill rest of the string from end
        for (int j = i - 1; j >= 0; j--)
        {

            // inserts %20 in place of space
            if (new_str[j] == ' ')
            {
                str[index] = '0';
                str[index - 1] = '2';
                str[index - 2] = '%';
                index = index - 3;
            }

            else
            {
                str[index] = new_str[j];
                index--;
            }
        }
        return str;



    }

    private String replace(String string) {

        final String appender  =  "%20";

        StringTokenizer stringTokenizer = new StringTokenizer(string," ");

        StringBuilder stringBuilder = new StringBuilder();

        while (stringTokenizer.hasMoreElements()) {


            stringBuilder.append(stringTokenizer.nextElement()).append(appender);
        }

        return stringBuilder.toString();


    }





    //------

    public void replaceString(char input[]){
        final int MAX = 1000;

        int space_counter =0;

        final Character SPACE = ' ';

        //count the number of spaces
        for(int i =0; i<input.length; i++){
            if(SPACE.equals(SPACE)){
                space_counter++;
            }
        }

       /* //remove the trailing space
        int i = input.length;

        while(input[i] == ' '){
            i--;
            space_counter--;
        }

        int new_length = space_counter*2+i;

        //itterate from behind and put the string

        char [] new_string = new char[new_length];

        for(int i=new_length; i>=0; i--){


            if(input[i] == ' '){

                new_string[i] = '0';
                new_string[i-1] = '2';
                new_string[i-2] = '%';
                //i = i-3;

            }else {
                new_string[i] = input[i];
                //i--;
            }

        }*/

       return ;
    }
}
