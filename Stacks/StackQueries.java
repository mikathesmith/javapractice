/*Prints maximum value in Stack
 * Mika Smith
 * 
 * Takes a query 
 * 1 x push element x
 * 2 delete top element
 * 3 print maximum
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        Stack<Integer> s = new Stack<Integer>();
        int max = 0; 
        
        
        for(int i=0; i< num; i++){
            int query = sc.nextInt();
            if(query == 1){ //push element to top of stack
                s.push(sc.nextInt());
                if(s.peek() > max){ //sets to maximum if bigger than max
                    max = s.peek();
                }
            }else if(query == 2){ //delete element on top of stack 
            	
                if(max == s.peek()){ //if the element we are deleting is also the max, reset max to 0
                    max=0;
                    s.pop(); //pop element off 
                    for(int si: s){ //check rest of elements to see which will be the new max
                        if(si>max){
                            max = si;
                        }
                    }   
                }else{
                    s.pop(); //element deleted is not the max so doesn't matter
                }          
            }else{
                System.out.println(max); //print max value        
            }
        }
    }
}