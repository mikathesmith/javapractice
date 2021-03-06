//Mika Smith
//Singly LinkedList exercise in Cracking the coding interview (pg 92) 
//Adding to list is a constant time, but iterating is time consuming as you need to iterate through n elements (O(n))

public class Node1{
	Node1 next = null;
	int data;
	
	public static void main(String[]args){

		appendToTail(5);
		appendToTail(4);
		appendToTail(3);
		appendToTail(2);
		appendToTail(1);
		
		
	}
	
	public Node1(int d){
		data = d;
	}
	
	public static void appendToTail(int d){
		Node1 end = new Node1(d);
		Node1 n= end;
		
		while(n.next != null){
			n= n.next;
		}
		n.next = end;
		System.out.println(n.data);
	}
	

}