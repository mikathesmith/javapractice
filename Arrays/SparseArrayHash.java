//Uses a HashMap to add numStrings strings to arr 
//and perform numQueries queries to see how many times 
//a query string is present in the array (exactly).

//O(1) constant time 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArrayHash{

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStrings = sc.nextInt();
        
        HashMap<String, Integer> hash = new HashMap<String, Integer>(numStrings); 
        sc.nextLine(); //skip over blank
        
        for(int i=0; i<numStrings; i++){
        	String temp= sc.nextLine();
        	if(hash.containsKey(temp)){  //If already containing the key temp, add 1 to quantity at value where key=temp
        		hash.put(temp, hash.get(temp)+1); 
        	}else{
        		hash.put(temp, 1); //else add temp and quantity 1 to hash table 
        	}
        	
        }
        
        //System.out.println(hash.toString());
        
        int numQueries = sc.nextInt();
        sc.nextLine();
        for(int i=0; i< numQueries; i++){
        	int count=0;
        	String query = sc.nextLine();	
        	try{
                count= hash.get(query); //retrieving is O(1)	
            }catch(NullPointerException e){
                count=0;
            } 
                
             
            
            System.out.println(count);
        }

        
        sc.close();
    }
}