package graphs;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class GraphDFS {
		
		private LinkedList<Integer> adj[];
		
		@SuppressWarnings("unchecked")
		public GraphDFS(int v) {
			adj = new LinkedList[v];
			for(int i = 0; i < v; i++) {
				adj[i] = new LinkedList<Integer>();
			}
		}
		
		public void addEdge(int source, int destination) {
			adj[source].add(destination);
			adj[destination].add(source);
		}
		
		/* Recursive Method -- 2 */
		private boolean DFSUtil(int source, int destination, boolean visited[]) {
			if(source == destination) return true;
			
			for(int neighbour: adj[source]) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					boolean isConnected = DFSUtil(neighbour, destination, visited);
					if(isConnected) return true;
				}
			}
			return false;
		}
		
		public boolean DFS(int source, int destination) {
			boolean visited[] = new boolean[adj.length];
			visited[source] = true;
			
			return DFSUtil(source, destination, visited);
		}
		
		/* DFS Stack Method -- 2 */
		public boolean DfsStack(int source, int destination) {
			boolean visited[] = new boolean[adj.length];
			visited[source] = true;
			Stack<Integer> stack = new Stack<>();		
			
			while(!stack.isEmpty()) {
				int current = stack.pop();
				
				if(current == destination) return true;
				
				for(int neighbour: adj[current]) {
					if(!visited[neighbour]) {
						visited[neighbour] = true;
						if(neighbour == destination) return true;
						stack.push(neighbour);
					}
				}
			}
			
			return false;
		}

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of vertices: ");
			int vertices = sc.nextInt();
			System.out.println("Enter the number of edges: ");
			int edges = sc.nextInt();
			
			GraphDFS graph = new GraphDFS(vertices);
			System.out.println("Enter "+ edges +" edges");
			for(int i = 0; i < edges; i++) {
				int source = sc.nextInt();
				int destination = sc.nextInt();
				graph.addEdge(source, destination);
			}
			System.out.println("Enter source and destination");
			
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			System.out.println(graph.DfsStack(source, destination));
			
			
			sc.close();
		}
}

/* Input 
 * Enter the number of vertices: 
5
Enter the number of edges: 
5
Enter 5 edges
0 4
4 3
3 2
2 1
1 2
Enter source and destination
0
1
true*/
