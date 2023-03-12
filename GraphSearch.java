import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GraphSearch {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public GraphSearch(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; // for an undirected graph
    }

    public void dfs(int startVertex, int endVertex) {
        boolean[] visited = new boolean[numVertices];
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);

        while (!stack.empty()) {
            int currentVertex = stack.pop();
            visited[currentVertex] = true;
            System.out.print(currentVertex + " ");

            if (currentVertex == endVertex) {
                System.out.println("\nDestination vertex found using DFS!");
                return;
            }

            for (int i = numVertices - 1; i >= 0; i--) {
                if (adjacencyMatrix[currentVertex][i] == 1 && !visited[i]) {
                    stack.push(i);
                }
            }
        }

        System.out.println("\nDestination vertex not found using DFS.");
    }

    public void bfs(int startVertex, int endVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            visited[currentVertex] = true;
            System.out.print(currentVertex + " ");

            if (currentVertex == endVertex) {
                System.out.println("\nDestination vertex found using BFS!");
                return;
            }

            for (int i = 0; i < numVertices; i++) {
                if (adjacencyMatrix[currentVertex][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }

        System.out.println("\nDestination vertex not found using BFS.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of vertices in the graph
        System.out.print("Enter the number of vertices: ");
        int numVertices = scanner.nextInt();

        GraphSearch graph = new GraphSearch(numVertices);

        // Get the edges of the graph from the user and add them to the graph
        System.out.println("Enter the edges of the graph in the format <source vertex> <destination vertex>");
        System.out.println("Enter -1 to end input");

        while (true) {
            int source = scanner.nextInt();
            if (source == -1) {
                break;
            }
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        // Get the source and destination vertices from the user
        System.out.print("Enter the source vertex: ");
        int startVertex = scanner.nextInt();

        System.out.print("Enter the destination vertex: ");
        int endVertex = scanner.nextInt();

        // Perform DFS and BFS from the source vertex to the destination vertex
        System.out.println("DFS:");
        graph.dfs(startVertex, endVertex);

        System.out.println("BFS:");
        graph.bfs(startVertex, endVertex);
        scanner.close();
    }
    
}
