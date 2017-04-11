/*
 * Mika Smith
 * Uses a hashtable to store words that are in a magazine. Then scans through the words in a ransom note 
 * to see if they are in the magazine. If all of the words in the note are in the magazine (case-sensitive,
 * only one use, cannot use substrings or concatenate), then we can print "Yes", otherwise print "No".
 *
 *Improvement on last version: 
 *
 */

import java.util.*;

public class RansomNote_v2 {

    public static boolean canBuildRansomNote(String[] magazine, String[] note) {
    	HashMap<String, Integer> magazineMap = getStringFrequency(magazine);
    	HashMap<String, Integer> noteMap = getStringFrequency(note);
        return hasEnoughStrings(magazineMap, noteMap);
    }
    
    public static HashMap<String, Integer> getStringFrequency(String[] words){
    	HashMap<String, Integer> wordFrequencies = new HashMap<String, Integer>();
    	for(String w: words){
    		if(!wordFrequencies.containsKey(w)){
    			wordFrequencies.put(w, 0);
    		}
    		wordFrequencies.put(w, wordFrequencies.get(w)+1);
    	}
    	return wordFrequencies;
    }
    
    public static boolean hasEnoughStrings(HashMap<String, Integer> magmp, HashMap<String, Integer> notemp){
    	for(Map.Entry<String, Integer> entry: notemp.entrySet()){
    		String word = entry.getKey();
    		if(!magmp.containsKey(word) || magmp.get(word) < entry.getValue()){
    			return false;
    		}
    	}
    	
    	return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); //num words in magazine
        int n = scanner.nextInt(); //num words in note 
        
        String[] note = new String[m];
        String[] magazine= new String[n];
        // Eat whitespace to beginning of next line
    //    scanner.nextLine();
        String magText = scanner.nextLine();
        Scanner magScan = new Scanner(magText);
        String noteText = scanner.nextLine();
        Scanner noteScan = new Scanner(noteText);
        
        int i=0;
        while(magScan.hasNext()){
        	
        	magazine[i] = magScan.next();
       // 	System.out.println(magazine[i]);
        	i++;
        }
 //       System.out.println(magazine.toString());
        i=0;
        while(noteScan.hasNext()){
        	note[i] = noteScan.next();
        //	System.out.println(note[i]);
        	i++;
        }
        
        
        
        boolean answer = canBuildRansomNote(note, magazine);
 
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
