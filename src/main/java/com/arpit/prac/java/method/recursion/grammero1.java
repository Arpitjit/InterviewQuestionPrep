package com.arpit.prac.java.method.recursion;

public class grammero1 {

    public int kthGrammar(int N, int K) {


        if (N == 1)
            return 0;
        int x = 1 << (N - 2);
        if (K > x) {
            return 1 - kthGrammar(N - 1, K - x);
        } else {
            return kthGrammar(N - 1, K);
        }
        //return 0;



    }

    public static void main(String[] args) {
        grammero1 grammero1 = new grammero1();


        System.out.println("o/p is::"+ grammero1.kthGrammar(30,434991989));
    }
}
