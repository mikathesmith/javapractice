/*
 * Mika Smith
 * if two kangaroos start at x1 and x2 , and moves at v1 and v2 meters, will they ever land in 
 * the same location? 
 * 
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt(); //kangaroo 1 starting position 
        int v1 = in.nextInt(); //kangaroo 1 moves at a rate of v1 meters
        int x2 = in.nextInt(); //kangaroo 2 starting position
        int v2 = in.nextInt(); //kangaroo 2 moves at a rate of v2 meters
        int jumps=0;
        Boolean same = false;
        while(jumps< 20000){
            x1+=v1;
            x2+=v2;
            if(x1 == x2){
                same=true;
                break;
            }
            jumps++;
        }
        if(same){
            System.out.println("YES");
        }else{
             System.out.println("NO");
        }
        
    }
}
