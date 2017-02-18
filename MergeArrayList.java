//Arraylists are an array-like data structure that offers dynamic resizing. 
//while still offering O(1) access. When the arraylist is full, it doubles in
//size. 


import java.util.*;


public class MergeArrayList{
	
	public static void main(String[]args){
		String[] s1 = new String[]{"cat","dog","rat"};
		String[] s2 = new String[]{"one","two","three"};
		System.out.println(merge(s1, s2)); 
		
	}
	
	public static ArrayList<String> merge(String[] words, String[] more){
		ArrayList<String> sentence = new ArrayList<String>();
		for(String w: words) sentence.add(w);
		for(String m: more) sentence.add(m);
		return sentence;
	}
	
}