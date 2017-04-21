import java.io.*;
import java.util.*;

public class Node{
	
	public Node(){
		
	}
}

public class DFS_BFS{
	
	public static void depthFirst(Node root){ //go deep before wide! 
		if(root==null) return; 
		visit(root);
		root.visited=true;
		for(Node n: root.adjacent){
			if(n.visited == false){
				search(n);
			}
		}
	}
	
	public static void breadthFirst(Node root){ //go wide before deep! use a queue instead of recursive
		Queue queue = new Queue();
		root.marked = true;
		queue.enqueue(root);
		
		while(!queue.isEmpty()){
			Node r= queue.dequeue();
			visit(r);
			for(Node n: r.adjacent){
				if(n.marked==false){
					n.marked = true; 
					queue.enqueue(n);
				}
			}
		}
	}
}