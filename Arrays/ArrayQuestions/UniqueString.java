//Implement an algorithm to determine if a string has all unique chracters. 
// Interview question 1.1 
//Author: Mika Smith
//V1: hashtables  

import java.util.*;
import java.io.*;


public class UniqueString{
	
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();		
		Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>(str.length());
		
		for(int i=0; i< str.length(); i++){
			char temp = str.charAt(i);
			if(hash.containsKey(temp)){
				hash.put(temp, hash.get(temp)+1);
				System.out.println("Not unique");
			}else{
				hash.put(temp, 1);		
			}	
		}
	}
	
}