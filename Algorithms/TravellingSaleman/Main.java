package Algorithms.TravellingSaleman;

public class Main {
    public static void main(String[] args) {
//        using backtracking
        System.out.println("backtracking() = " + backtracking());
    }

    private static int backtracking() {
        // n is the number of nodes i.e. V
        int n = 4;

        int[][] graph = {{0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}};

        boolean[] visited = new boolean[n];
        visited[0] = true;
        // requires graph , visited , start(0) , end(n) , cost,  ans
        return tsp(graph, visited, 0, graph.length - 1, 0, 0, Integer.MAX_VALUE);
    }

    private static int tsp(int[][] graph, boolean[] visited, int currPos, int size, int count, int cost, int ans) {
        if (count == size && cost + graph[currPos][0] > 0){
            ans = Math.min(ans, cost + graph[currPos][0]);
            return ans;
        }

        for (int i = 0; i < size + 1; i++) {
            if (visited[i] == false && graph[currPos][i] > 0){
                visited[i] = true;
                ans = tsp(graph, visited, i, size, count + 1, cost + graph[currPos][i], ans);

                visited[i] = false;
            }
        }
        return ans;
    }
}
