//Compares sums found when adding together numbers in an hourglass shape to find the maximum
//sum in a 6 x 6 2D Array

//Learned: j=column, i=row

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class 2dArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        scan.close();
        
        findMax(findSums(arr));
       
        
    }
        
    
    public static int[] findSums(int[][] arr){
        int count=0; 
        int sums[] = new int[16];
        for(int i=0; i<4; i++){   
            for(int j=0; j<4; j++){
                int sum=0;
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum+=arr[i+1][j+1];
                sum+=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                
                sums[count]= sum; 
                count++;
            
            }
        }
        return sums;
    }
    
    public static void findMax(int[] sums){   
        int high=sums[0];
        for(int i=1; i< sums.length; i++){     
            if(sums[i] > high){
                high = sums[i];
            }  
        }
        System.out.println(high);
        
    }
}