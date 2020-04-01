package com.arpit.prac.java.method.CrakingCoadingInterview;

public class tes2 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int total_elements = nums1.length + nums2.length;

        int median = total_elements / 2;


        if(total_elements %2 ==0){
            int first_element = 0;
            int second_element = 0;

            if(median< nums1.length){
                first_element = nums1[median-1];
            }else {
                first_element = nums1[median-nums1.length-1];
            }

            if(median+1< nums1.length){
                second_element= nums1[median];
            }else {
                second_element = nums1[median-nums1.length];
            }


            return (first_element+second_element)/2;
        }else {
            int first_element =0;
            if(median< nums1.length){
                first_element = nums1[median-1];
            }else {
                first_element = nums1[median-nums1.length-1];
            }

            return first_element;


        }

    }
}
