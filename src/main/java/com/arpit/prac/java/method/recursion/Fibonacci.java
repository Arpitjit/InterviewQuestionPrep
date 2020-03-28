package com.arpit.prac.java.method.recursion;

public class Fibonacci {


    public int fib(int N) {

        int[] cache = new int[N];


        return fibonacciFunc(N, cache);

    }



    public int fibonacciFunc(int N, int[] cache ) {

        if(N==0){
            return 0;
        }

        if( N==1){
            return 1;
        }

        cache[N-1] = fibonacciFunc(N-1, cache);

        cache[N-2] = fibonacciFunc(N-2, cache);

        return cache[N-1]+ cache[N-2];

    }


    public static void main(String[] args) {
        System.out.println(new Fibonacci().fib(10));
    }
}
