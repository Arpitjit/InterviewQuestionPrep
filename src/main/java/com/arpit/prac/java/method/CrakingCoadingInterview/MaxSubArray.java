package com.arpit.prac.java.method.CrakingCoadingInterview;

import com.arpit.prac.java.method.recursion.MaxSubstring;

public class MaxSubArray {

    public static void main(String[] args) {
        MaxSubArray mxaMaxSubstring = new MaxSubArray();

        int array[] = new int [] {-1, -2, -3, -4};

        System.out.println(mxaMaxSubstring.maxSubArray(array));
    }

    private int maxSubArray(int[] array) {

        int global_max =array[0];
        int local_max = array[0];

        int index =1;
        while(index < array.length){

            if(local_max+array[index]> local_max){
                local_max += array[index];

                if(local_max>global_max){
                    global_max = local_max;
                }
            } else {
                local_max =0;
            }
            index++;
        }
        return global_max;
    }
}
