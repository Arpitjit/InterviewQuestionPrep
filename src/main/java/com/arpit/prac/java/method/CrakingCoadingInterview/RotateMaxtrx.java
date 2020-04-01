package com.arpit.prac.java.method.CrakingCoadingInterview;

public class RotateMaxtrx {

    public static void main(String[] args) {
        RotateMaxtrx rotateMaxtrx = new RotateMaxtrx();

        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        rotateMaxtrx.rotate(array);
    }

    private void rotate(int[][] array) {

        int row = array.length;

        int column = array[0].length;

        int temp = 0;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                if (i == j || j> i) {

                    continue;
                }


                temp = array[i][j];

                array[i][j] = array[j][i];


                array[j][i] = temp;


            }

            System.out.println();

        }

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");


            }
            System.out.println();

        }

        for (int row_count = 0; row_count < row; row_count++) {

            for (int colCount = 0; colCount < column/2; colCount++) {


                System.out.print(array[row_count][colCount]+ "->" +array[row_count][column - colCount - 1]);


                temp = array[row_count][colCount];

                array[row_count][colCount] = array[row_count][column - colCount - 1];

                array[row_count][column - colCount - 1] = temp;

            }
        }


        System.out.println("*************");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");


            }
            System.out.println();

        }


    }
}
