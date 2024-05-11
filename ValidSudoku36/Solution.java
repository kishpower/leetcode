package ValidSudoku36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        int n = board.length;

        for (int i = 0 ; i < n; i++){
            for (int j = 0 ; j < n ; j++){
                char number = board[i][j];
                if (number != '.'){
                   if(!seen.add(number + " in row " + i) ||
                           !seen.add(number + " in row " + j) ||
                           !seen.add(number + " in block " + i/3 + "-" + j/3))
                       return false;
                }
            }
        }
        return true;
    }
}
