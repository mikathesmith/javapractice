/*
 * Mika Smith
 * Checks to see how many character deletions are required for 
 * two strings to be anagrams. 
 * 
 * Improvement on last version by not actually worrying about creating
 * the anagram, rather just counting up the frequencies of each character
 * in each string and computing the difference. 
 * 
 * Could be improved by using a hashtable! 
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagram_v2 {
    public static int ALPHANUM = 26;
    
    public static int[] getCharCounts(String word){
        int[] charCounts = new int[ALPHANUM];
        for(int i=0; i<word.length();i++){
            char c= word.charAt(i);
            int offset = (int)'a'; //converts character 'a' to number representation      
            int code = c-offset;   //finds representation of c to convert to index in alphabet
            charCounts[code]++;
        }
        
        return charCounts;
    }
    
    public static int deltaCount(int[] c1, int[] c2){
        if(c1.length != c2.length){
            return -1;
        }
        int delta=0;
        for(int i=0; i<ALPHANUM;i++){
            delta += Math.abs(c1[i]-c2[i]);
        }
        return delta;
    }
    
    public static int numberNeeded(String first, String second) {
        int[] charCount1 = getCharCounts(first);
        int[] charCount2 = getCharCounts(second);
        return deltaCount(charCount1, charCount2);
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
