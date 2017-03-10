import java.util.*;
/*
Insert Node at the end of a linked list 
head pointer input could be NULL as well for empty list
Node is defined as 

*/

public class Node {
	   int data;
	   Node next;
}

public class InsertNth1{
	
	public void InsertNth1(Node head, int data, int position) {

 
    //Initialise new node with input data and next value as null
    Node n = new Node(), prev = new Node(), curr = new Node();
    n.data = data;
    n.next = null;
    
    //If empty list, position regardless
    if(head==null){
        head.data = data;
        head.next=null;
        System.out.println(head.data);
    }
    
    //If position is 0, insert new node at head of list. next to n is head. 
    if(position == 0){
        n.next = head;
        System.out.println(n.data);
    }
    
    //Initilaise previous as null and current as head. 
    prev= null;
    curr= head; 
    
    ///Iterate through list to find the position we are inserting. 
    for(int i= 0; i< position && curr !=null; i++ ){
        prev = curr; //keep track of previous 
        curr= curr.next; 
    }
    n.next = prev.next; //next to n is value of current
    prev.next = n;  //current is n 
    
    System.out.println(head.data);
   // return head; 

	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			InsertNth1(sc.nextInt(), sc.nextInt());
		}
	}
	
}