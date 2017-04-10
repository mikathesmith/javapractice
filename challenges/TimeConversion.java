/*
 * Mika Smith
 * Takes in a time in hh:mm:ssAM format and converts to 24 hour time
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder oldtime = new StringBuilder();
        oldtime.append(in.next()); //contains time in a 12-hour clock format hh:mm:ssAM
        StringBuilder newtime = new StringBuilder();
        int prefix; 
        DecimalFormat df = new DecimalFormat("00"); 
        
        if((oldtime.substring(8)).equals("AM")){ //if AM
            prefix=Integer.parseInt(oldtime.substring(0,2));
            if(prefix==12){
                prefix=00;
            }
            newtime.append(df.format(prefix));         
            //if 12:45 am then 00:45am
        }else{                                //if PM
            prefix = Integer.parseInt(oldtime.substring(0,2)) +12; //convert to int, add 12, back to string
            if(prefix==24){
                prefix=12;
            }
            newtime.append(Integer.toString(prefix));
            
        }
        newtime.append(oldtime.substring(2,8));
        System.out.println(newtime.toString());
    }
}
