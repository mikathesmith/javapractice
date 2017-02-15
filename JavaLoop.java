import java.util.*;
import java.io.*;

class JavaLoop{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int num: series(a,b,n)){
                System.out.print(num +" ");
            }
            System.out.print("\n");
        }
        in.close();
        
        
        
    }
    
    public static int[] series(int a, int b, int n){
        int[] sol = new int[n];
        int prev=a;
        for(int i=0; i<n; i++){
            prev+= Math.pow(2, i)*b;
            sol[i]= prev;            
        }
        
        return sol;
    }
}