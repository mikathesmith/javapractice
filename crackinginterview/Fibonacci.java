/*
 * Mika Smith
 * Recusion with memoising 
 * 
 */

import java.util.*;
import java.io.*;

public class Fibonacci{
	public static int[] memo = new int[41];
	
	public static void main(String[]args){
		for(int i=0;i<41;i++){
			memo[i] = -1;
		}
		memo[0] =0;
		memo[1] = 1; 
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n){
		if(memo[n]!=-1) return memo[n];
		memo[n] = fibonacci(n-1) + fibonacci(n-2);
		return memo[n];
	}
	
	public static int InefficientFib(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		return InefficientFib(n-1)+InefficientFib(n2);
	}
	
	
}