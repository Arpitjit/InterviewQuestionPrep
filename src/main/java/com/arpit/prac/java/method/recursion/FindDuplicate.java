package com.arpit.prac.java.method.recursion;

public class FindDuplicate {

    public int findDuplicate(int [] array){

        int a =0;

        for (int i:array) {

            a ^=i;
        }

        return a;


    }

    public static void main(String[] args) {
        FindDuplicate findDuplicate = new FindDuplicate();

        int [] array = {1,1,2,2,3};

        System.out.println(findDuplicate.findDuplicate(array));
    }
}
