/*
Breadth first search on an undirected graph
using an adjacency linked list

*/

import java.io.*;
import java.util.*;

public class BFS{
	
	
	public static class Vertex{
		String name; //name of vertex
		Neigbour adjList; //reference to neighbour object
		vertex(String name, Neighbour neighbours){
			this.name = name;
			this.adjList = neighbours;
		}
	}
	
	public static class Neighbour{
		public int vertexNum;
		public Neighbour next; //pointer to next neihghbour 
		public Neighbour(int vnum, Neighbour nbr){
			this.vertexNum = vnum;
			next = nbr;
		}
	}
	
	public static class Graph{
		vertex[] adjList; 
	}
	
	public static class Queue<T> {
		
	}
	//driver
	public void bfs(){
		Queue<Integer> queue = new Queue<Integer>();
		boolean[] visited = new boolean[adjLists.length];
		for(int v=0; v<visited.length; v++){
			if(!visited[v]){
				bfs(v, visited, queue);
			}
		}
	}
	
	public void bfs(int start, boolean[] visited, Queue<Integer> queue){
		visited[start] = true; 
		System.out.println("visiting "+ adjLists[start].name);
		queue.enqueue(start);
		while(!queue.isEmpty()){
			int v= queue.dequeue();
			for(Neighbour nbr = adjLists[v].adjList; nbr!=null; nbr=nbr.next){
				int vnum = nbr.vertexNum;
				if(!visited[vnum]){
					System.out.println("visiting" + adjLists[vnum].name);
					visited[vnum] = true;
					queue.enqueue(vnum);
				}
			}
		}
	}
	
	
}