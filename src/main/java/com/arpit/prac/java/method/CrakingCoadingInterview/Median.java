package com.arpit.prac.java.method.CrakingCoadingInterview;

public class Median {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        //take the sum

        int median =0;
        int length1 =0;
        int length2 = 0;
        //take the sum
        if(null != nums1){
            length1 = nums1.length;

        }

        if(null != nums2){
            length2 = nums2.length;
        }




        median = (length1 + length2) / 2;




        System.out.println("median is:" + median);


        //check if its even
        boolean isEven = false;

        if ((nums1.length + nums2.length) % 2 == 0) {
            System.out.println("botth the arrays combined have even elements");

            isEven = true;
        }

        if(length1 ==0){

            if(isEven){
                return (nums2[median]+ nums2[median-1])/2.0;
            }else{
                return nums2[median];
            }

        }

        if(length2 ==0){

            if(isEven){
                return (nums1[median]+ nums1[median+1])/2.0;
            }else{
                return nums1[median];
            }

        }

        //itterate both arrays and get the median
        int num_itterator1 = 0;
        int num_itterator2 = 0;
        int itterator = 1;
        int sum = 0;


        while (itterator <= (nums1.length + nums2.length)) {

            int number = 0;


            System.out.println(num_itterator1 + "  " + num_itterator2);

            if (num_itterator1 <= (nums1.length - 1)
                    && nums1[num_itterator1] <= nums2[num_itterator2]) {
                number = nums1[num_itterator1];

                num_itterator1++;

            } else if (num_itterator2 <= (nums2.length - 1)) {
                number = nums2[num_itterator2];

                num_itterator2++;
            }

            System.out.println("Order is " + number);


            if (isEven) {
                if (itterator == median || median + 1 == itterator) {
                    sum += number;
                }

            } else {
                if (itterator == median + 1) {
                    sum += number;
                    return sum;
                }

            }

            itterator++;


        }


        return sum / 2.0;


    }


    public static void main(String[] args) {
        int[] array1 = {1};
        int[] array2 = {1};

        Median median = new Median();

        System.out.println("Median is::" + median.findMedianSortedArrays(array1, array2));
    }
}
