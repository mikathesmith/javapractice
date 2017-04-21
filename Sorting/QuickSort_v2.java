import java.util.*;
public class QuickSort_v2{
       
static void quickSort(int[] ar) {
             quickSort(ar, 0, ar.length-1); //start recursion
       }  
    
//This method sorts the array by constantly dividing it using partition
static void quickSort(int[] ar, int left, int right) {
            if(left>=right) return;
    
         //   int pivot = ar[(left+right)/2];
            int index = partition(ar, left, right);
            if(left < index-1){
                quickSort(ar, left, index-1);
            }
            if(index < right){
                quickSort(ar, index+1, right);
            }
            printArray(ar, left, right);
       } 
//This method chooses pivot as the first value and determines whether or not a value is less than or greater to the pivot, placing
//it to the left or to the right of the pivot respectively. 
static int partition(int[] ar, int left, int right) {
        int pivot = ar[left];
        ArrayList<Integer> leftList  = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();
        
        for (int i = left + 1 ; i <= right; i++) {
            if (ar[i] < pivot) {
                leftList.add(ar[i]);
            } else {
                rightList.add(ar[i]);
            }
        }
            
        int startTemp = left;
        //Re-create the array  
        for (int i = 0 ; i < leftList.size() ; i++){
            ar[startTemp] = leftList.get(i);
            startTemp++;
        }
       	//Find where the pivot has moved to, where it was initially + num elements in leftlist 
        int newPivotIndex = left + leftList.size();
        ar[newPivotIndex] = pivot; //move pivot to new index. 
        startTemp = newPivotIndex + 1; //start at element to right of pivot
        
        for (int i = 0 ; i < rightList.size(); i++){ 
            ar[startTemp] = rightList.get(i); //add everything in rightlist to array 
            startTemp++;
        }
        return newPivotIndex; //return the new index of the pivot. 
  } 
    

 static void printArray(int[] ar, int left, int right) {
         for(int n=left; n<= right; n++){
            System.out.print(ar[n]+" ");
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
