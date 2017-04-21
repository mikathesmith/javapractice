/*
 * Mika Smith
 * Always picks the pivot to be the rightmost value. 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuickSort_v3{
    public static void quickSort(int[]ar){
        if(ar!=null){
            quickSort(ar, 0, ar.length-1);
        }
    }
    public static void quickSort(int[] ar, int start, int end){
        if(start < end){  
            int index = partition(ar, start, end); //returns position of new pivot. 
            printArray(ar, 0, ar.length-1); 
            
            quickSort(ar, start, index-1); //sorts left segment
            quickSort(ar, index+1, end);   //sorts right segment
        } 
    }
    //Instead of copying the array into multiple sub-arrays, use indices to keep track of the different sub-arrays. 
    //You can pass the indices to a modified partition method. The partition method should partition the sub-array 
    //and then return the index location where the pivot gets placed, so you can then call partition on each side of the pivot.
    public static int partition(int[] ar, int start, int end){
        int pivot = ar[end]; //pivot is rightmost element
        int pIndex = start-1; //scan the array to find if any elements are less than the pivot
        for(int i=start; i<= end-1; i++){
            if(ar[i] <= pivot){
                pIndex++;
                swap(ar, pIndex, i); //if they are then swap then with the pIndex     
            }   
        }
        swap(ar, pIndex+1, end); //finally, swap the last element with the pivot. 
        return pIndex+1; //returns the new position where the pivot gets placed. 
    }
    
    public static void swap(int[] ar, int i, int j){
        int temp = ar[i];
        ar[i]=ar[j];
        ar[j]=temp; 
    }
    
    public static void printArray(int[] ar, int start, int end){
        if(start<end){
            for(int i=start; i<=end; i++){
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        for(int i=0; i< N;i++){
            ar[i] = sc.nextInt();
        }
        quickSort(ar);  
    }
}