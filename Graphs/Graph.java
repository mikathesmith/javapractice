import java.util.*;
import java.io.*;

public class Graph{
	private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
	
	public static class Node{
		private int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();
		private Node(int d){
			this.id=id;
		}
	}
	
	private Node getNode(int id){
		Node node = new Node(id);
		return node; 
		
	}
	
	public void addEdge(int source, int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		s.adjacent.add(d);
	}
	
	//takes in source and destination ids. 
	public boolean hasPathDFS(int source, int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();
		return hasPathDFS(s, d, visited);
	}
	
	public boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited){
		if(visited.contains(source.id)){
			return false; //no path
		}
		visited.add(source.id); //otherwise mark node as visited. 
		if(source == destination) return true; //if I'm at my destination
		for(Node child : source.adjacent){ //check chidlren and see if they have a path
			if(hasPathDFS(child, destination, visited)){
				return true; 
			}
		}
		return false;
	}
	
	public boolean hasPathBFS(int source, int destination){
		return hasPathBFS(getNode(source), getNode(destination));
	}
	
	private boolean hasPathBFS(Node source, Node destination){
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>();
		nextToVisit.add(source);//visit source
		while(!nextToVisit.isEmpty()){
			Node node = nextToVisit.remove(); //pull up next node to visit
			if(node ==destination){
				return true;
			}
			if(visited.contains(node.id)){
				continue;
			}
			visited.add(node.id);
			for(Node child: node.adjacent){ //queue children at the end 
				nextToVisit.add(child);
			}
		}
		return false; 
	}
}