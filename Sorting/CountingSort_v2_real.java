import java.io.*;
import java.util.*;

/*
 * Mika Smith
 * 
 * Efficient counting sort algorithm = O(n)
 * 
 * For each i in the original array, use the 
 * value at position i of the totalCount array
 * as the index in the resulting array where we
 * will place our string s. 
 */

public class CountingSort_v2_real {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        String[] strings = new String[n];
        int[] frequencies = new int[100];
        
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            String s = sc.next();
            numbers[i] = number;
            strings[i] = (i<n/2) ? "-" : s; 
            frequencies[number] ++;;
        }
        
        
        int totalCount = 0;
        int[] indexes = new int[100];
        for (int i=1; i<100; i++) {
            totalCount += frequencies[i-1]; //why?
            indexes[i] = totalCount;
        }
        
        String[] result = new String[n];
        for (int i=0; i<n; i++) {
            String s = strings[i]; //get string at position i 
            int index = indexes[numbers[i]]; //get index of the number (in original array at position i) in the index array
   //         int freq = frequencies[numbers[i]];
            result[index] = s; //add string to result at position index in result array 
            indexes[numbers[i]]++; //increment the countung array at that position so next time we place in the position above
        }
       
        
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            sb.append(result[i] + " ");
        }
        System.out.println(sb);
    }
}
