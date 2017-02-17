import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class 2dArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        scan.close();
        
        int count=0; 
        int sums[] = new int[16];
        for(int i=0; i<4; i++){   
            for(int j=0; j<4; j++){
                int sum=0;
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum+=arr[i+1][j+1];
                sum+=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                
                sums[count]= sum; 
                count++;
            
            }
        }
        
        int high=sums[0];
        for(int i=1; i< sums.length; i++){     
            if(sums[i] > high){
                high = sums[i];
            }  
        }
        System.out.println(high);
        
    }
}
