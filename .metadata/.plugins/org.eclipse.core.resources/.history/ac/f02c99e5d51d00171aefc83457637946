/*
 * Mika Smith
 * Uses a hashtable to store words that are in a magazine. Then scans through the words in a ransom note 
 * to see if they are in the magazine. If all of the words in the note are in the magazine (case-sensitive,
 * only one use, cannot use substrings or concatenate), then we can print "Yes", otherwise print "No".
 */

import java.util.*;

public class RansomNote{

    public static void main(String[] args) {
        Map<String, Integer> magazineMap = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();  //num words in magazine
        int n = scanner.nextInt();  //num words in ransom note

        //take in words in magazine
        for(int i=0; i<m; i++){
            String magazine = scanner.next();
            
            if(magazineMap.containsKey(magazine)){
                magazineMap.put(magazine, magazineMap.get(magazine)+1);
            }else{
                magazineMap.put(magazine, 1);
            }
        }
        
        //iterate through words in note and see if they are in magazine
        boolean answer = true; 
        for(int i=0; i<n; i++){ 
            String note = scanner.next(); 
            
            if(magazineMap.containsKey(note)){   //if note is in magazine map
                int val = magazineMap.get(note); //get the count/value of note  
                if(val==1){ //If the value is 1, we remove the key entirely                
                    magazineMap.remove(note); 
                }else{ //else we have at least 2, so just decrement the value
                    magazineMap.put(note, val-1); //decrement value of note
                }
            }else if(!magazineMap.containsKey(note)){ //if note is not in magazine, then we cannot replicate the note 
                answer=false;
            }
        }
        scanner.close();

        if(answer){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
      
    }
}
