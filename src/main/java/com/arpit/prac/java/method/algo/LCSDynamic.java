package com.arpit.prac.java.method.algo;

import static sun.swing.MenuItemLayoutHelper.max;

public class LCSDynamic {

    public static void main(String[] args) {
        LCSDynamic lcs = new LCSDynamic();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is" + " " +
                lcs.lcs(X, Y, m, n));
    }

    private int lcs(char[] x, char[] y, int m, int n) {


        int[][] memory = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {

            for (int j = 0; j <= n; j++) {

                if (i == 0 || j == 0)
                    memory[i][j] = 0;

                else if (x[i-1] == y[j-1]) {
                    memory[i][j] = 1 + memory[i - 1][j - 1];

                } else {
                    memory[i][j] = max(memory[i-1][j], memory[i][j-1]);
                }

            }



        }

        return memory[m][n];
    }
}
