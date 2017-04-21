import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
/*
 * Mika Smith
 * 
 * Takes in input of a value and an associated string. 
 * Values are not unique. We must sort the values using 
 * counting sort then print the sorted strings. 
 * TWIST: don't print the first half of the array, instead
 * use "-". 
 * 
 * Test case: 
 *20
0 ab
6 cd
0 ef
6 gh
4 ij
0 ab
6 cd
0 ef
6 gh
0 ij
4 that
3 be
0 to
1 be
5 question
1 or
2 not
4 is
2 to
4 the

Expected output: - - - - - to be or not to be - that is the question - - - -
 * 
 * Incredibly inefficient - lots of for loops! 
 */

import java.util.regex.*;

public class CountingSort_V1{

    public static void main(String[] args) {
        HashMap<Integer, ArrayList<String>> wordMap = new HashMap<Integer, ArrayList<String>>();
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        String[] words = new String[N];
        int[] ar_freq= new int[N];
        
        for(int i=0; i< N; i++){
            ar[i] = sc.nextInt();
            int value = ar[i];
            ar_freq[value]++; 
            if(i<(N/2)){
                sc.next();
                words[i] = "-";
            }else{
                words[i] = sc.next();
            }
        }
        
        for(int i =0; i<N;i++){
            ArrayList<String> wordList = new ArrayList<String>(); 
            for(int j=0; j<N;j++){
                if(i==ar[j]){
                    wordList.add(words[j]);
                }
            }
            wordMap.put(i, wordList);
        }

        for(int i=0; i< ar.length;i++){  
            int value = i;
            int frequency = ar_freq[i];
            ArrayList<String> grabwords = new ArrayList<String>(wordMap.get(i));
            for(int f=0; f<frequency;f++){
                System.out.print(grabwords.get(f) +" ");
            }
        }
    }
}