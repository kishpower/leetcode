package GameofLife289;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[][] ints = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        gameOfLife(ints);
    }

    public static void gameOfLife(int[][] board) {
        // 2/3 neighbors -> live cell survives
        // <2 neighbors -> live cell dies
        // =3 neighbors -> dead cell revives
        // >3 neighbors -> live cell dies

        int rowLen = board.length;
        int colLen = board[0].length;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int u=0 ; u < rowLen ; u++){
            for (int v=0 ; v < colLen ; v++){
                int  temp = 0;
                int i;
                int rowLimit = u + 1 > rowLen - 1 ? u : u + 1;
                for (i = u - 1 < 0 ? u : u - 1; i <= rowLimit; i++) {
                    int j;
                    int colLimit = v + 1 > colLen - 1 ? v : v + 1;
                    for (j = v - 1 < 0 ? v : v - 1; j <= colLimit; j++) {
                        if (i == u && j == v) continue;
                        temp += board[i][j];

                    }
                }
                if (board[u][v] == 1){
                    if (temp == 2 || temp == 3){
                       arr.add(1);
                    }else if(temp > 3 || temp < 2){
                       arr.add(0);
                    }
                }else {
                    if (temp == 3) arr.add(1);
                    else arr.add(0);
                }
            }
        }

        for (int i = 0 ; i < arr.size() ; i++){
            board[i/colLen][i%colLen] = arr.get(i);
        }
    }
}
