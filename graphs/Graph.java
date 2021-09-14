package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
	
	private LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	public Graph(int v) {
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public void BFS(int source, int destination) {
		boolean visited[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(source);
		parent[source] = -1;
		visited[source] = true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();  // Take out first element from queue
			if (current == destination) break;
			
			for(int neighbour: adj[current]) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					queue.add(neighbour);
					parent[neighbour] = current;
				}
			}
		}
		
		int current = destination;
		int distance = 0;
		while(parent[current] != -1) {
			System.out.print(current + " <- ");
			current = parent[current];
			distance++;
		}
		System.out.print(source);
		System.out.println("\nMinimun distance : " +distance);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices: ");
		int vertices = sc.nextInt();
		System.out.println("Enter the number of edges: ");
		int edges = sc.nextInt();
		
		Graph graph = new Graph(vertices);
		System.out.println("Enter "+ edges +" edges");
		for(int i = 0; i < edges; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			graph.addEdge(source, destination);
		}
		System.out.println("Enter source and destination");
		
		int source = sc.nextInt();
		int destination = sc.nextInt();
		
		graph.BFS(source, destination);
		
		sc.close();
	}
}


/* Input 
 * Enter 6 edges
	0 1
	0 4
	1 2
	2 3
	4 3
	2 4
*/
