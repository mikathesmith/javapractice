/*
 * Mika Smith
 * Takes in a number n
 * n specifies the height and base of our staircase of #'s
 * eg 6 will result in: 
 *   #
    ##
   ###
  ####
 #####
######

	We add n-i spaces and i hashes 
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //height and base
        
        
        for(int i=1; i <= n; i++){
            StringBuilder string = new StringBuilder();
            for(int x=0; x < n-i; x++){
                string.append(" "); //add n-i of these
            }
            for(int x=0; x < i; x++){
                string.append("#"); //add i of these 
            }
            System.out.println(string);
        }
    }
}
