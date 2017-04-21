/*
 * Mika Smith
 * A cycle occurs when a node's next points back to a 
 * previous node in the list. This means the list 
 * is no longer linear with a beginning and an end, and
 * instead cycles through a loop of nodes. 
 * 
 * O(n) time and O(1) space. 
 */

import java.util.*;
import java.io.*;

public class Node{
	Node next;
	int data;
	public Node(int data){ //constructor
		this.data= data;
	}
}

public class ContainsCycle{
	
	public static void main(String[] args){
		
	}
	
	public static boolean contains_cycle(Node head){
		Node fast = head; 
		while(fast!=null && fast.next!=null){
			head = head.next; 
			fast = fast.next.next; 
			
			if(slow.equals(fast)){
				return true; 
			}
		}
		
		return false; 
	}
	
}