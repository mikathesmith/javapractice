import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int grade){
        // Complete this function
    	if(grade>=38){ 
    		int mod5 = grade%5; //eg 42/5 remains 2
    		if(mod5>2){ //if its at least 3 away from the next multiple 
    			grade+= 5-mod5;  //adds 3 to grade to round up to 5
    		}	
    	}
    	return grade;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            System.out.println(solve(in.nextInt()));
        }
        in.close();
    }
}
