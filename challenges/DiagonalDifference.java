/*
 * Mika Smith
 * This programs takes in a NxN matrix and prints the absolute difference of 
 * the sum of each of the two diagonals. 
 * 
 * Takes input n for number of rows and columns, and n following lines of 
 * input as the matrix. 
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int primaryDiagonal=0, secondaryDiagonal=0;
        int dif = n-1;
        for(int val=0; val < n; val++){
           primaryDiagonal += a[val][val]; 
           secondaryDiagonal += a[val][dif]; 
           dif--;   
        }

       int absDif = Math.abs(primaryDiagonal - secondaryDiagonal);
        System.out.println("Absolute difference is: " + absDif);
        
        
    }
}
