package Algorithms.Dijkstras;

import Algorithms.Dijkstras.PriorityQueueImpl.Edge;
import Algorithms.Dijkstras.PriorityQueueImpl.Pair;

import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws IOException {
//        priorityQueueImpl();

//       adjacency matrix impl
       adjMatrixImpl();
    }

    private static void adjMatrixImpl() {
        int grph[][] = new int[][] { { -1, 3, -1, -1, -1, -1, -1, 7, -1 },
                                    { 3, -1, 7, -1, -1, -1, -1, 10, 4 },
                                    { -1, 7, -1, 6, -1, 2, -1, -1, 1 },
                                    { -1, -1, 6, -1, 8, 13, -1, -1, 3 },
                                    { -1, -1, -1, 8, -1, 9, -1, -1, -1 },
                                    { -1, -1, 2, 13, 9, -1, 4, -1, 5 },
                                    { -1, -1, -1, -1, -1, 4, -1, 2, 5 },
                                    { 7, 10, -1, -1, -1, -1, 2, -1, 6 },
                                    { -1, 4, 1, 3, -1, 5, 5, 6, -1 } };

        dijkstra(grph, 0);
    }

    private static void dijkstra(int [][] graph, int src){
        int n = graph.length;
        int[] distances = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[src] = 0;

        for (int i = 0; i < n - 1; i++) {
           int u = minDistanceVertex(distances, visited);
           visited[u] = true;

           for (int j = 0; j < n ; j++){
               if(
                   !visited[j] && // vertex is not visited
                   graph[u][j] != -1 && // vertex is connected with minDistance Vertex
                   distances[u] != Integer.MAX_VALUE && // Distance of minDistanceVertex is finite
                   distances[u] + graph[u][j] < distances[j] // relaxation condition - distance of minDistanceVertex + distance from minDistanceVertex to vertex < distance of vertex
               ){
                   distances[j] = distances[u] + graph[u][j]; // relaxation
               }
           }
        }
        printDistances(distances);
    }

    private static void printDistances(int[] distances) {
        for (int distance :
                distances) {
            System.out.println(distance +  "   ");
        }
    }

    private static int minDistanceVertex(int[] distances, boolean[] visited) {
        int minVertex = -1;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < distances.length ; i++){
            if (!visited[i] && distances[i] < minDist){
                minDist = distances[i];
                minVertex = i;
            }
        }
        return minVertex;
    }

    private static void priorityQueueImpl() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/ganeshwalunj/myProjects/Java Practice/leetcode/Algorithms/Dijkstras/PriorityQueueImpl/input.txt")));

        int noOfVertices = Integer.parseInt(reader.readLine());
        ArrayList<Edge>[] graph = new ArrayList[noOfVertices + 1];

        for (int i = 0; i < noOfVertices + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        int noOfEdges = Integer.parseInt(reader.readLine());

        for (int i = 0 ; i < noOfEdges ; i++){
            String edgeDescription = reader.readLine();
            String[] tokens = edgeDescription.split(" ");
            int v1 = Integer.parseInt(tokens[0]);
            int v2 = Integer.parseInt(tokens[1]);
            int wt = Integer.parseInt(tokens[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int src = Integer.parseInt(reader.readLine());
        boolean[] visited = new boolean[noOfVertices + 1];
        pq.add(new Pair(src,src + "", 0));
        while(pq.size() != 0){
            Pair rem = pq.remove();

            if (visited[rem.vertex] == true){
              continue;
            }

            visited[rem.vertex] = true;
            System.out.println(rem.vertex + " via " + rem.pathFromSourceNode + " @ " + rem.weightOfThePath);

            for(Edge e : graph[rem.vertex]){
               if (visited[e.dest] == false){
                   pq.add(new Pair(e.dest , rem.pathFromSourceNode + " -> " + e.dest , rem.weightOfThePath + e.weight));
               }
            }
        }
    }
}
