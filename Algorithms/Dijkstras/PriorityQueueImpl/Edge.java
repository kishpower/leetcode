package Algorithms.Dijkstras.PriorityQueueImpl;

public class Edge {
        int src;
        public int dest;
        public int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
}
