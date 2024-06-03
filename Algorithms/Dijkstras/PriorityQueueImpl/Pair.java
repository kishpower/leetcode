package Algorithms.Dijkstras.PriorityQueueImpl;

public class Pair implements Comparable<Pair>{
    public Pair(int vertex, String pathFromSourceNode, int weightOfThePath) {
        this.vertex = vertex;
        this.pathFromSourceNode = pathFromSourceNode;
        this.weightOfThePath = weightOfThePath;
    }

    public int vertex;
    public String pathFromSourceNode;
    public int weightOfThePath;
    @Override
    public int compareTo(Pair o) {
        return this.weightOfThePath - o.weightOfThePath;
    }

}

