package com.arpit.prac.java.method;

public class test {

    public static void main(String[] args) {

        test test = new test();

        System.out.println(test.checkDuplicates("ab"));
    }

    private boolean checkDuplicates(String str) {

        int checker = 0;
        int var =0;

        for(Character character: str.toCharArray()){

             var = 'a'-character;

            // check if the character is present



            if( (checker & (1<<var)) ==1){
                return true;
            }

            checker |= (1<<var);


        }

        return false;

    }
}
