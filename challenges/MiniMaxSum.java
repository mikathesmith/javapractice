/*
 * Mika Smith
 * takes 5 integer values and finds the sums from exactly 4 of the integers. 
 * Prints the minimum and maximum sums possible
 * 
 * Could be improved upon in summing all values but i, and finding the max and min
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long[] arr = {a,b,c,d,e};
        long[] sums = new long[5];
        long min=0, max=0; 
        
        for(int i=0; i< 5; i++){
            int x=0;
            long sum=0; 
            
            while(x<5){
                if(x!=i){
                    sum +=arr[x];
                }
                x++;
            }           
            sums[i] = sum;
        }
        Arrays.sort(sums);
      //  List s = Arrays.asList(sums);
        System.out.print(sums[0] + " ");
        System.out.print(sums[4]);
    }
}
