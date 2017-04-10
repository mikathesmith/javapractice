/*
 * Mika Smith
 * This program takes input of n for number of candles on cake, 
 * followed by n spaced integers of heights.
 * Output will be the number of tallest candles there are - 
 * this is the number that can be blown out. 
 * 
 * Uses a hashmap to map heights to frequencies of that height
 * It keeps a record of the highest value we see, and at the 
 * end gets the value (frequency) associated with that height (key) 
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int height[] = new int[n];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>(); //<Key, Value>
        int max=0; 
        for(int height_i=0; height_i < n; height_i++){
           // height[height_i] = in.nextInt();
            int cur_height = in.nextInt(); 
            if(hash.containsKey(cur_height)){ //already contains key
                hash.put(cur_height, hash.get(cur_height) + 1);
            }else{
                hash.put(cur_height, 1);
            }
            if(cur_height>max){
                max=cur_height;
            }
        } //inserts all into hashmap
        //now find the highest key and print the associated value
        System.out.println(hash.get(max));
        
      
    }
}
