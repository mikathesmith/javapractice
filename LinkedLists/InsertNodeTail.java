/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
public InsertNodeTail{
	

	public Node Insert(Node head,int data) {
	    
	    /*If passed a null value, initialise head with input data and initialise node next to head as null. Return head. */ 
	    if(head == null){
	        head.data = data;
	        head.next= null;
	       /// System.out.println("null " + head.data);
	        return head;
	    }
	    
	    /*Initialise holder nodes */ 
	    Node temp = new Node(), h = new Node();
	    h = head; //hold onto original head; 
	    
	    /*Set temporary node to input data and next to null. Will insert into linked list later */ 
	    temp.data = data; 
	    temp.next = null; 
	    
	    /*Iterate through the linked list to find the end.*/
	    while(head.next != null){
	        head = head.next;
	    }
	    head.next = temp;  //Inserted temp at tail list 
	
	    return h; //return original head -never changes
	}
	
	public static void main(String[]args){
		Insert();
		
		
	}
}

