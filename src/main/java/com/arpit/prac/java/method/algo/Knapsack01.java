package com.arpit.prac.java.method.algo;

public class Knapsack01 {


    private static int knapSack(int w, int[] wt, int[] val, int n) {

        //base case
        if(w ==0 || n == 0){
            return w;
        }



        if(wt[n-1] > w){
            return knapSack(w, wt, val, n-1);
        }

        //here two things needs to be done one add the return weight i.e. max weight and
        // when we do not do that
        return max(val[n-1] +knapSack(w-wt[n-1], wt, val, n-1), knapSack(w, wt, val, n-1));



    }

    public static int  max(int a, int b){
        return a>b?a:b;
    }

    // Driver program to test above function
    public static void main(String args[])
    {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}
