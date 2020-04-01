package com.arpit.prac.java.method.CrakingCoadingInterview;

public class SubArrayWithGIvenSum {


    public static void main(String[] args) {

        SubArrayWithGIvenSum subArrayWithGIvenSum = new SubArrayWithGIvenSum();

        int[] array = {1,2,3,7,5};

        int [] arrayO =subArrayWithGIvenSum.findSubArray(array, 12);

        for (int i:arrayO
             ) {
            System.out.println(i +" ");

        }



    }


    public int [] findSubArray(int [] nums, int target){


        int [] output = new int[0];


        int slow_pointer = 0, fast_pointer =0, sum =0;

        while(fast_pointer<nums.length){

            if(sum < target){
                sum += nums[fast_pointer++];
            }else{

                sum -= nums[slow_pointer++];
            }

            if(sum == target){

                output = new int[fast_pointer-slow_pointer];
                int i=0;

                while(slow_pointer<fast_pointer){
                    output[i++] = nums[slow_pointer++];

                }

                return output;
            }


        }

        return output;

    }
}
