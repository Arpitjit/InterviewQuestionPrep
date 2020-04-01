package com.arpit.prac.java.method.recursion.sort;

import java.util.Arrays;

public class MergeSort {

    public int[] sortArray(int[] nums) {
        if(nums.length<2){
            return nums;
        }


        return mergeSort(nums);



    }

    private int[] mergeSort(int[] nums) {

        if(nums.length ==1){
            return nums;
        }


        int pivot = nums.length/2;

        int [] leftArray = Arrays.copyOfRange(nums, 0, pivot);
        int [] rightArray = Arrays.copyOfRange(nums,pivot, nums.length );

       int [] sortedLeftArray = mergeSort(leftArray);
       int [] sortedRightArray = mergeSort(rightArray);

      return merge(sortedLeftArray, sortedRightArray);

    }

    private int[] merge(int[] leftArray, int[] rightArray) {

        int leftArrayItterator = 0;
        int rightArrayItterator = 0;
        int mergedArrayIndex = 0;

        int [] mergedArray = new int[leftArray.length+ rightArray.length];

        while ((leftArrayItterator <leftArray.length) && (rightArrayItterator < rightArray.length)){


            if(leftArray[leftArrayItterator]< rightArray[rightArrayItterator]){
                mergedArray[mergedArrayIndex] = leftArray[leftArrayItterator];
                leftArrayItterator++;
            }else{
                mergedArray[mergedArrayIndex] = rightArray[rightArrayItterator];
                rightArrayItterator++;
            }
            mergedArrayIndex++;
        }

        if(leftArrayItterator <= leftArray.length-1){
            for (int i =leftArrayItterator;i< leftArray.length;i++, mergedArrayIndex++){
                mergedArray[mergedArrayIndex] = leftArray[i];
            }

        }

        if(rightArrayItterator <= rightArray.length-1){
            for (int i =rightArrayItterator;i< rightArray.length;i++, mergedArrayIndex++){
                mergedArray[mergedArrayIndex] = rightArray[i];
            }

        }


        return mergedArray;


    }

    public static void main(String[] args) {
        int array [] = {10, 2, 8, 16, 57, 100, -2, 3};

        MergeSort mergeSort = new MergeSort();

        int arry [] = mergeSort.sortArray(array);
        System.out.println("*******");

        for(int i=0;i<arry.length;i++){

            System.out.print(arry[i]+ " ");
        }

   }


}
