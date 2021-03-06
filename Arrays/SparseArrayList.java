//Uses an array list to add numStrings strings to arr 
//and perform numQueries queries to see how many times 
//a query string is present in the array (exactly).

//To improve on, try with HashMap 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStrings = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        sc.nextLine(); //advance to skip blank space
        for(int i=0; i<numStrings ; i++) arr.add(sc.nextLine());
        int numQueries = sc.nextInt();
        sc.nextLine();//advance to skip blank space

        for(int i=0; i<numQueries; i++){
            String query = sc.nextLine();
            int count=0;
            for(String s: arr){
                if(query.equals(s)==true){
                    count++;
                }
            }
            System.out.println(count);
        }
        
        sc.close();
    }
}