/*
 * Mika Smith
 * Checks to see how many character deletions are required for 
 * two strings to be anagrams. 
 * 
 * Improvement on last version by adding a hashtable 
 * Now constant time! 
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagram_hash_v3{
    public static int ALPHANUM = 26;
    
    public static HashMap<Character, Integer> getCharCounts(String word){
        HashMap<Character, Integer> charCounts = new HashMap<Character, Integer> ();
        for(int i=0; i< word.length(); i++){
        	char c= word.charAt(i);
        	if(charCounts.containsKey(c)){
        		charCounts.put(c, charCounts.get(c)+1);
        	}else{
        		charCounts.put(c, 1);
        	}
        }
        return charCounts; 
    }
    
    public static int deltaCount(HashMap<Character, Integer> c1, HashMap<Character, Integer> c2){
        int delta=0;
        
       // for(int i=0; i< Math.max(c1.size(), c2.size()); i++){
        Set<Character> keys = c1.keySet();
        for(Character key : keys){
        	if(c1.get(key) ==null || c2.get(key)==null){
        		return -1;
        	}
    
       // 	System.out.println(difference);
            delta += Math.abs(c1.get(key) - c2.get(key));
        }
        
        return delta;
    }
    
    public static int numberNeeded(String first, String second) {
        HashMap<Character, Integer> charCount1 = getCharCounts(first);
        HashMap<Character, Integer> charCount2 = getCharCounts(second);
        return deltaCount(charCount1, charCount2);
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
