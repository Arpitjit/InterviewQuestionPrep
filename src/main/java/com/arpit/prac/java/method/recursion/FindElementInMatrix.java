package com.arpit.prac.java.method.recursion;

public class FindElementInMatrix {


    public boolean searchMatrix(int array[][], int element){
        int columns = array.length-1;
        int row = array[0].length-1;



       return binarySearch(array, element, 0, row, 0,columns);

    }

    private boolean binarySearch(int[][] array, int element, int xStart, int xEnd, int yStart, int yEnd) {

        if(xStart ==xEnd || yStart==yEnd){
            return false;
        }

        int pivotX = (xEnd-xStart)/2;
        int pivotY = (yEnd -yStart)/2;

        System.out.println("Pivot x::"+pivotX+" pivotY::"+ pivotY);

        if(array[pivotX][pivotY] == element){
            return true;
        }else if(element < array[pivotX][pivotY]){
           return binarySearch(array, element, xStart, pivotX, yStart, pivotY);
        }else {
          return  binarySearch(array, element, pivotX, xEnd, pivotY, yEnd);

        }

    }



    public static void main(String[] args) {
        int [][] array =   {{1,   4,  7, 11, 15},
                            {2,   5,  8, 12, 19},
                            {3,   6,  9, 16, 22},
                            {10, 13, 14, 17, 24},
                            {18, 21, 23, 26, 30}};


        FindElementInMatrix findElementInMatrix = new FindElementInMatrix();


        System.out.println(findElementInMatrix.searchMatrix(array, 30));


    }
}
