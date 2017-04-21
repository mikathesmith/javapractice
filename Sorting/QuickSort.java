import java.util.*;
public class Solution {
       
static void quickSort(int[] ar) {
             quickSort(ar, 0, ar.length-1); //start recursion
             printArray(ar);
       }  
    
static void quickSort(int[] ar, int left, int right) {
            if(left>=right) return;
    
            int pivot = ar[(left+right)/2];
            int index = partition(ar, left, right, pivot);
    
            quickSort(ar, left, index-1);
            quickSort(ar, index, right);
       } 
    
static int partition(int[] ar, int left, int right, int pivot) {
    while(left<=right){
        while(ar[left] < pivot){
            left++;
        }
        while(ar[right] < pivot){
            right--;
        }
        if(left<=right){
            swap(ar, left, right);
            left++;
            right--;
        }
   }
      
   return left;                  
  } 
    
static void swap(int[] ar, int left, int right) {
             int temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;    
       } 
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           quickSort(ar);
       }    
   }
