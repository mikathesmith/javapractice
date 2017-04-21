/*
 *Mika Smith
 * Singly linked list 
 */

import java.util.*

public class Node{
	Node next;
	int data;
	public Node(int data){ //constructor
		this.data= data;
	}
	
	
	
}

//Define a class that wraps the head so its called in one place
public class LinkedList{
	Node head; 
	/*Add value at tail end of linked list*/
	public void append(int data){
		if(head==null){ //No head exists so we create one
			head = new Node(data);
			return;
		}
		Node current = head; //pointer that starts at head of linked list
		while(current.next!=null){ //go through list
			current = current.next;
		}
		current.next= new Node(data);
	}
	
	/*Change what head node is*/
	public void prepend(int data){
		Node newHead = new Node(data);
		newHead.next = head; //the new head links to old head
		//change pointer value
		head= newHead;
	}
	
	public void InsertNth(int data, int position) {
		 
	    //Initialise new node with input data and next value as null
	    Node n = new Node(), prev = new Node(), curr = new Node();
	    n.data = data;
	    n.next = null;
	    
	    //If empty list, position regardless
	    if(head==null){
	        head.data = data;
	        head.next=null;
	        return head;
	    }
	    
	    //If position is 0, insert new node at head of list. next to n is head. 
	    if(position == 0){
	        n.next = head;
	        return n; 
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
	  
	    return head; 
	}
	
	public void deleteWithValue(int data){
		if(head == null) return;
		if(head.data == data){ //if we need to delete the head
			head = head.next; //walk around it
			return;
		}
		
		//walk though linked list and stop one 
		//before the element we want to delete
		Node current = head;
		while(current.next !=null){
			//if we've found a node which 
			//matches the one we want to delete
			if(current.next.data ==data){//cut out next value
				current.next = current.next.next; 
				return;
				//walk around the element.
			}
			current = current.next; //continue walking
		}
	}
	
	public void deleteWithPosition(int position){
		if(head == null) return;
		if(position== 0){ //if we need to delete the head
			head = head.next; //walk around it
			return;
		}
		
		//walk though linked list and stop one 
		//before the element we want to delete
		Node current = head;
		int i=0;
		while(current.next !=null){
			//if we've found a node which 
			//matches the one we want to delete
			if(position ==i){//cut out next value
				current.next = current.next.next; 
				return;
				//walk around the element.
			}
			current = current.next; //continue walking
			i++;
		}
	}
	
	public void ReversePrint() {
		  // This is a "method-only" submission. 
		  // You only need to complete this method. 
		    Stack<Integer> nodes = new Stack<Integer>(); 
		    if(head !=null){
		        Node current = head; 
		        while(current!=null){
		          //  System.out.println(current.data);
		            nodes.push(current.data);
		            current = current.next;
		        }
		        
		        while(!nodes.empty()){
		            System.out.println(nodes.pop());
		        }
		    }
		}
	/*Uses Floyd's cycle detection/tortoise and hare algorithm
	 * with two pointers, each moving at different speeds. If these
	 * two ever meet, then there is a cycle. If not, return false. 
	 */
	public boolean hasCycle(Node head) {
	    if(head == null) return false;
	    Node slow, fast;
	    slow = fast = head; 
	    //slow moves every 1, fast moves every two. 
	    while(true){
	        slow = slow.next;
	       
	        if(fast!=null){
	             fast = fast.next.next;
	        }else{
	            return false; 
	        }
	        
	        if(slow==null || fast==null){
	            return false; 
	        }
	        
	         if(fast==slow){
	            return true;
	        }
	    }
	}
	/*Reverses order of linked list*/ 
	public void reverseList(){
	    if(head == null) return head;
	    Stack<Integer> nodes = new Stack<Integer>(); 
	    Node current = head; 
	    while(current!=null){
	        nodes.push(current.data);
	        current=current.next;
	    }
	    
	   // System.out.println(data);
	    head.data = nodes.pop();
	    current = head;
	    while(!nodes.empty() && current.next!=null){
	        current = current.next;
	        current.data = nodes.pop();     
	    }
	    return head; 
	}
	
	//returns 1 if lists are equal and 0 if not
	public int CompareLists(Node headA, Node headB) {
	    if(headA == null && headB != null || headA!=null && headB==null) return 0;
	    
	    Node current1 = headA;
	    Node current2= headB; 
	    while(current1!=null && current2!=null){ //if lists are of different length this does not work as it will say true once terminating! 
	        if(current1.data != current2.data){
	            return 0;
	        }
	        
	        current1= current1.next;
	        current2=current2.next;
	    }
	    
	    if(current1!=null || current2!=null){ //if once terminatine the loop there are still node left in one of the lists.
	        return 0;
	    }
	    return 1;
	}
}