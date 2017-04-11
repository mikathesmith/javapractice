/*
 * Mika Smith
 * Checks to see how many character deletions are required for 
 * two strings to be anagrams. 
 * 
 * First attempt: building actual anagram and deleting from first and second words,
 * then finding what's leftover.
 * This works and passes but is SUPER inefficient. 
 * 
 
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagram {
    public static int deleteCount=0; 
    public static StringBuilder first = new StringBuilder();   
    public static StringBuilder second = new StringBuilder(); 
    
    public static String findAnagram(String fw, String sw) {
      StringBuilder anagram = new StringBuilder();   
      String temp; 
      first.append(fw);  
      second.append(sw);

       //need to iterate through all of second to see if in first, then all of first to see if in second 
      while(second.length() > 0  || first.length() > 0){   // as soon as both are 0 this will break           
          if(second.length()!=0){
                  temp = Character.toString(second.charAt(0)); 
                  if(first.indexOf(temp) != -1){ //check if letter temp from second is in first 
                      addToAnagram(anagram, temp);
                 }else{ //if first contains character in second, delete from first and second? 
                      deleteCount++;
                      second.deleteCharAt(second.indexOf(temp)); //delete character temp from second word. 
                  }
          }else{ //second has run out of characters so we see if there are any remaining in first
                  temp = Character.toString(first.charAt(0));
                  if(second.indexOf(temp) != -1){
                      addToAnagram(anagram, temp);     
                    }else{       
                      deleteCount++;
                      first.deleteCharAt(first.indexOf(temp));
                }
          }
      }      
      return anagram.toString(); 
    }
    
  //delete in both
    public static void addToAnagram(StringBuilder anagram, String temp){
        anagram.append(temp); //then append the character in second to final anagram
        first.deleteCharAt(first.indexOf(temp)); 
        second.deleteCharAt(second.indexOf(temp));
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next(); 
        String b = in.next();
        findAnagram(a, b);
        System.out.println(deleteCount);
    }
}
