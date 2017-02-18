//This program takes an array of length size and an int of number of left rotations to be done.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numRotations = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<size; i++) arr.add(sc.nextInt());
        
        leftRotate(arr, numRotations);     
        for(int i: arr) System.out.print(i + " ");
        
    }
    
    public static void leftRotate(ArrayList<Integer> arr, int numRotations){
       for(int i=0; i< numRotations; i++) arr.add(arr.remove(0));
    }
}