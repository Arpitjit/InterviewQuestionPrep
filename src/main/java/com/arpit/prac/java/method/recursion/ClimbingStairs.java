package com.arpit.prac.java.method.recursion;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {


    Map<Integer, Integer> cache = new HashMap<>();

    public int climbStairs(int n) {

        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }

        Integer numberOfStepsFromCache = cache.get(n);

        if(null != numberOfStepsFromCache){
            return numberOfStepsFromCache;
        }

        int nMinusOneways = climbStairs(n-1);
        int nMinusTwoWays = climbStairs(n-2);

        cache.put(n-1, nMinusOneways);
        cache.put(n-2, nMinusTwoWays);

        return nMinusOneways + nMinusTwoWays;

    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        System.out.println(climbingStairs.climbStairs(3));
    }

}
