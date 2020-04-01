package com.arpit.prac.java.method.recursion;

public class ReverseArray {

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k , nums.length-1);

    }

    public void reverseArray(int [] arrays, int start, int end){
        while(start < end){

            int temp = arrays[start];

            arrays[start] = arrays[end];

            arrays[end] = temp;

            start++;
            end --;

        }
    }


    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();

        int [] ary = {1,2,3,4,5};

        reverseArray.rotate(ary, 2);
    }
}
