
/*

In this program, we first get the number of vertices in the graph from the user. 
We then initialize an n x n adjacency matrix with all elements set to 0.

Next, we prompt the user to input the edges of the graph in the 
format <source vertex> <destination vertex>. We use a sentinel value of -1 to indicate 
that the input is complete. For each edge input by the user, we set the corresponding 
element in the adjacency matrix to 1.

Finally, we display the adjacency matrix to the console.

Here's an example input and output for a graph with 5 vertices and the 
edges (0, 1), (0, 2), (1, 2), (1, 3), and (2, 4): 

*/

import java.util.Scanner;

public class GraphAdjacencyMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of vertices in the graph
        System.out.print("Enter the number of vertices: ");
        int n = scanner.nextInt();

        // Initialize the adjacency matrix
        int[][] adjacencyMatrix = new int[n][n];

        // Get the edges of the graph from the user and set them in the adjacency matrix
        System.out.println("Enter the edges of the graph in the format <source vertex> <destination vertex>");
        System.out.println("Enter -1 to end input");

        while (true) {
            int source = scanner.nextInt();
            if (source == -1) {
                break;
            }
            int destination = scanner.nextInt();
            adjacencyMatrix[source][destination] = 1; // for an unweighted graph
            // If the graph is weighted, you can set the weight instead of 1
        }

        // Display the adjacency matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();      
    }
    
}
