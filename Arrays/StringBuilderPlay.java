//StringBuilder creates a resizable array of all strings, copying them back to a string only when necessary. 

import java.util.*;
import java.lang.*;

public class StringBuilderPlay{
	
	public static void main(String[]args){
		String[] s1 = new String[]{"I","am","a","cat","lover"};
		System.out.println(joinWords(s1));
	}
	
	public static String joinWords(String[] s1){
		StringBuilder sentence = new StringBuilder();
		for(String s: s1){
			sentence.append(s);
		}
		return sentence.toString(); 
		
	}
	
	
	
}