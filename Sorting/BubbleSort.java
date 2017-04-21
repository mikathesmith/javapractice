/*
 * Mika Smith
 * 
 * Input = n giving size of array, followed by n elements. 
 * 
 * This program sorts a given array using a naive bubblesort algorithm. 
 * Bubblesort works by iterating through the array and swapping two elements
 * when one to the right is smaller than the other. It continues to walk through
 * the array until it returns that the array is sorted - when no swaps happen in 
 * a traversal. 
 * 
 * O(n) passes. each pass taking O(n) time. 
 * Takes O(n^2) time but only O(1) space. 
 */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort {
    public static int[] a;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort();
    }
    
    static void bubbleSort(){
        int totalSwaps=0; 
        for(int j=0; j< a.length-1; j++){
            int numSwaps = 0; 
            for(int i=0; i< a.length - 1; i++){
                if(a[i] > a[i+1]){
                    swap(i, (i+1));
                    numSwaps++;
                }
            }
            totalSwaps +=numSwaps; 
            if(numSwaps==0){
                break; 
            }   
        }
        System.out.println("Array is sorted in "+totalSwaps + " swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: "+ a[a.length-1]);
    }
    
   static void swap(int b, int c){
        int temp = a[b]; 
        a[b] = a[c];
        a[c] = temp;
    }
}