package com.arpit.prac.java.method.recursion;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionBetweenTwoList {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap();

        for(Integer i:nums1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        ArrayList<Integer> list = new ArrayList(nums1.length);
        for(Integer i:nums2){

            if(map.get(i)!=null && map.get(i)>0){
                map.put(i, map.get(i)-1);
                list.add(i);
            }
        }

        int[] output = new int[list.size()];

        int counter = 0;
        for(Integer i: list){
            output[counter++] = i;

        }

        return output;

    }

    public static void main(String[] args) {

        IntersectionBetweenTwoList intersectionBetweenTwoList = new IntersectionBetweenTwoList();

        int [] array1 = {1,2,2,1};
        int [] array2 = {2,2};

       int [] array3 = intersectionBetweenTwoList.intersect(array1, array2);

       int i =0;
       while(i< array3.length){
           System.out.println(array3[i++]);
       }

    }


}
