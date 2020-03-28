package com.arpit.prac.java.method.recursion;


 class Solution {
     public void reverseString(char[] s) {

         helper((s.length-1)/2, s, s.length);

         System.out.println(s);

     }


     public static void helper(int index, char [] charArray, int lenght){

         if(index <0){
             return;
         }
         char endChar = charArray[index];

         char firstChar = charArray[lenght-index-1];


         charArray[lenght-index-1] = endChar;

         charArray[index] = firstChar;

         System.out.println(endChar+" - "+firstChar );
         helper(index-1, charArray, lenght);



     }




    public static void main(String[] args) {

        Solution sol = new Solution();
        sol.reverseString("Hello".toCharArray());



    }
}



