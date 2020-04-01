package com.arpit.prac.java.method.CrakingCoadingInterview;

import java.util.HashSet;

public class SumTripplet {

    public static void main(String[] args) {

        int[] array = {1,5,3,2};

        SumTripplet sumTripplet = new SumTripplet();

        int [] arrayo = sumTripplet.findSum(array);

        for (int i:arrayo
             ) {
            System.out.println(i+", ");

        }
    }

    private int [] findSum(int[] array) {

        HashSet set = new HashSet(array.length);

        for (int i:array
             ) {
            set.add(i);
        }


        int slow_pointer=0, fast_pointer =1;

            while(fast_pointer < array.length){


                if(set.contains(array[slow_pointer]+array[fast_pointer])){
                    return new int []{array[slow_pointer],array[fast_pointer], array[slow_pointer]+ array[fast_pointer]};
                }else {
                    fast_pointer++;
                }

                if(fast_pointer == array.length){
                    slow_pointer++;
                    fast_pointer = 0;
                    slow_pointer++;
                }



        }


        return new int[]{-1};
    }
}
