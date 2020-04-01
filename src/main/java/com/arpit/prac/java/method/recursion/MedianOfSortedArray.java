package com.arpit.prac.java.method.recursion;

public class MedianOfSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int totalElement = nums1.length + nums2.length;


        int [] newArray = new int [totalElement];

        int itterator = 0;

        int firatArray = 0;

        int secondArray =0;

        boolean isEven = false;

        if(totalElement%2 ==0){
            isEven = true;
        }

        int median =0;

        int medianElement = totalElement/2;

        while (itterator< firatArray){

            if(nums1[firatArray]< nums2[secondArray]){
                newArray[itterator++] = nums1[firatArray++];
            }else {
                newArray[itterator++] = nums2[secondArray++];
            }

        }

        if(isEven){
            median = newArray[medianElement]+ newArray[medianElement+1]/2;
        }else {
            median = newArray[medianElement];
        }

        return median;

    }

    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int [] arr2 = {2};

        MedianOfSortedArray medianOfSortedArray = new MedianOfSortedArray();

        medianOfSortedArray.findMedianSortedArrays(arr1, arr2);
    }
}
