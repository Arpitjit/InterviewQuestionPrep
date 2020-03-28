package com.arpit.prac.java.method.recursion;

public class Power {

    public double myPow(double x, int n) {



            if (n == 0) {
                return 1;
            }

        double xy = myPow(x,n/2);


        if (n % 2 == 0) {
                return x*x;

            } else {
            return xy*x*x;

            }

    }

    public static void main(String[] args) {
        Power power = new Power();

        System.out.println(power.myPow(2, -10));
    }
}
