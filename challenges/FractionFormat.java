/*
 * Mika Smith
 * Takes a sequence of numbers
 * Prints what fraction are positive, negative or zero
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FractionFormat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int pos=0, neg=0, zer=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]==0){
                zer++;
            }else if(arr[arr_i]>0){
                pos++;
            }else{
                neg++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        double zerfrac, posfrac, negfrac;
        zerfrac= (double)zer/n;
        posfrac= (double)pos/n;
        negfrac= (double)neg/n;   
        
        System.out.println(df.format(posfrac));
        System.out.println(df.format(negfrac));
        System.out.println(df.format(zerfrac));

    }
}
