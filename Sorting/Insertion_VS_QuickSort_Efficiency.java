import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Insertion_VS_QuickSort_Efficiency{
    public static int numSwapsQuick =0; 
    public static int numSwapsInsertion =0; 
    
    public static int getInsertionTime(int [] ar){
     //   System.out.println(insertionSort(ar));
          return insertionSort(ar); 
     //   return 0; 
    }
    
    public static int insertionSort(int [] ar){
        for(int i=1; i< ar.length;i++){
            int value = ar[i];
            int j = i-1;
            while(j>=0 && value<ar[j]){
                swap(ar, j, j+1);
                j--;
                numSwapsInsertion++;
            }
            //printArray(ar);
        }
        return numSwapsInsertion;
    }
    
    public static int getQuickSortTime(int[] ar){
        return quickSort(ar, 0, ar.length-1);
    }
    
    public static int quickSort(int[] ar, int lo, int hi){
        if(lo < hi){
            int partitionIndex = partition(ar, lo, hi);
          //  printArray(ar);
            quickSort(ar, lo, partitionIndex-1);
            quickSort(ar, partitionIndex+1, hi);
        }
        return numSwapsQuick;  
    }
    //one swap = whenever an element is less than the pivot. 
    public static int partition(int[] ar, int lo, int hi){
        int pivot = ar[hi];
        int pIndex = lo-1;
        for(int i=lo; i<=hi-1;i++){
            if(ar[i] < pivot){
                pIndex++;
                numSwapsQuick++; 
                swap(ar, i, pIndex);
            }
        }
        swap(ar, pIndex+1, hi);
        numSwapsQuick++; 
        return pIndex+1; 
    }
    
    public static void swap(int[]ar, int a, int b){
        int temp = ar[a];
        ar[a]=ar[b];
        ar[b]=temp;
    }
    
    public static void printArray(int[] ar){
        for(int i=0; i< ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    
    public static int delta(int swapsInsertion, int swapsQuick){
        return Math.abs(swapsInsertion - swapsQuick);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar=new int[N];
        int[] ar2= new int[N];
        for(int i=0; i< N;i++){
            ar[i] = ar2[i]= sc.nextInt();
        }
        System.out.println(getInsertionTime(ar) - getQuickSortTime(ar2));
        
        //
    }
}