import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(); //start of house
        int t = in.nextInt(); //end of house
        int a = in.nextInt(); //apple tree
        int b = in.nextInt(); //orange tree
        
        int m = in.nextInt(); //number of apples that fall 
        int n = in.nextInt(); //number of oranges that fall
        int distTree, aplNum=0, oraNum=0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            distTree = in.nextInt() + a; 
            if(distTree>=s && distTree <= t){
                aplNum++; 
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            distTree = b + in.nextInt(); 
            if(distTree <= t && distTree >= s){
                oraNum++; 
            }
        }
        
        System.out.println(aplNum); //print number of apples fallen on house
        System.out.println(oraNum); //print number of oranges fallen on house
    }
}
