package linkedList;

import java.util.LinkedList;


public class MyLinkedList{
    
	
    //Properties
    Node head;
    int count;
    
    //Constructors
    public MyLinkedList(){
        head=null;
        count=0;
    }
    
    public MyLinkedList(Node newHead){
        head=newHead;
        count=1;
    }
    
    //Methods
    public void add(int newData){
        Node temp=new Node(newData);
        Node current=head;
        while(current.getNext() !=null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    
    public int get(int index){
        if(index <=0){
            return -1;
        }
        
        Node current=head;
        for(int i=1; i< index; i++){
            current=current.getNext();
        }
        return current.getData();
    }
    
    public int size(){
        return count;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void remove(){
        //remove from back of list
        Node current=head;
        while(current.getNext().getNext() !=null){
            current=current.getNext();
        }
        current.setNext(null);
        count--;
    }
    
    public static void main(String[]args){
        LinkedList<String> linkedList = new LinkedList<String>(); 
        linkedList.add("Alice");
        linkedList.add("Alicey");
        System.out.println(linkedList);
    
    }

}