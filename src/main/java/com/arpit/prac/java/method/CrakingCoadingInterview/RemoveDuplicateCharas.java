package com.arpit.prac.java.method.CrakingCoadingInterview;

import java.util.Arrays;

public class RemoveDuplicateCharas {

    public static void main(String[] args) {


        RemoveDuplicateCharas removeDuplicateCharas = new RemoveDuplicateCharas();

        removeDuplicateCharas.removeDuplocates("aabbcddeeff".toCharArray());
    }

    private void removeDuplocates(char [] nums) {

        if(nums == null){
            return;
        }

        if(nums.length < 2){
            return;
        }

        boolean [] hit = new boolean[256];


        int tail =0;

        hit[0] = true;

        for (int i=0; i< nums.length; i++){

            if(!hit[nums[i]]){
                nums[tail] = nums[i];

                tail++;
                hit[nums[i]] = true;
            }
        }


        for(Character c: nums){
            System.out.println(c);
        }
        nums[tail] = 0;

    }
}
