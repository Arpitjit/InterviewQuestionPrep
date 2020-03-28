package com.arpit.prac.java.method.recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> pascalRow = new ArrayList<>();


        int [][] memory = new int[rowIndex+1][rowIndex+1];
        for (int i = 0; i <= rowIndex; i++) {

            pascalRow.add(calclulateRowElement(rowIndex, i, memory));

        }

        System.out.println(pascalRow);

        return pascalRow;
    }

    private int calclulateRowElement(int rowIndex, int columnIndex, int [][] memory) {

        if(columnIndex == 0 || rowIndex == columnIndex){
            return 1;
        }

        System.out.println("getting the ["+ rowIndex+"] ["+ columnIndex+"]");

        int cache = memory[rowIndex][columnIndex];

        if(cache != 0){
            System.out.println("From cache");
            return cache;
        }

         cache = memory[columnIndex][rowIndex];

        if(cache != 0){
            System.out.println("From cache");
            return cache;
        }

        memory[rowIndex - 1][columnIndex - 1] = calclulateRowElement(rowIndex - 1, columnIndex - 1, memory);

        memory[rowIndex - 1][columnIndex] = calclulateRowElement(rowIndex - 1, columnIndex, memory);

        return  memory[rowIndex - 1][columnIndex - 1] + memory[rowIndex - 1][columnIndex];


    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.getRow(30);
    }
}
