import java.util.*;

public class LeftRotation{
	
	public static void main(String[]args){
		int[] arrayToRotate = {1,2,3,4,5,6,7,8,9,10};
		int rotateBy = 4; 
		
		System.out.println("Original Array");
		for(int i=0; i< arrayToRotate.length; i++){
			System.out.print("["+arrayToRotate[i]+"]");
		}
		
		rotate(arrayToRotate, rotateBy);
		
		System.out.println("Resulting Array");
		for(int i=0; i< arrayToRotate.length; i++){
			System.out.print("["+arrayToRotate[i]+"]");
		}
		
	}
	
	public static void rotate(int[] arrayToRotate, int rotateBy){
		//reverse 0 to rotateBy-1 elements
		reverse(arrayToRotate, 0, rotateBy-1);
		
		//reverse rotateBY to array length -1 
		reverse(arrayToRotate, rotateBy, arrayToRotate.length-1);
	
		//reverse the whole thing 
		reverse(arrayToRotate, 0, arrayToRotate.length-1);
	}
	
	public static void reverse(int[] arrayToReverse, int start, int end){
		while(start<end){
			int temp = arrayToReverse[start];
			arrayToReverse[start]= arrayToReverse[end];
			arrayToReverse[end]= temp;
			start++;
			end--;
		}
			
	
	}
	
	
	
}