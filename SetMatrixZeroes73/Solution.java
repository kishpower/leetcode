package SetMatrixZeroes73;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public void setZeroes(int[][] matrix) {
        // traverse and get i , j till length set zero.
        Set<Integer> visitedZeroOnRows = new HashSet<>();
        Set<Integer> visitedZeroOnColumns = new HashSet<>();


        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for (int i = 0; i < rowLen ; i++){
            for (int j = 0 ; j < colLen; j++){
                int temp = matrix[i][j];
                if(temp == 0){
                    visitedZeroOnRows.add(i);
                    visitedZeroOnColumns.add(j);
                }
            }
        }

        Iterator<Integer> iterator = visitedZeroOnRows.iterator();

        for (int i = 0 ; i < visitedZeroOnRows.size(); i++){
            Integer row = iterator.next();
            for (int j = 0 ; j < colLen; j++){
                matrix[row][j] = 0;
            }
        }

        iterator = visitedZeroOnColumns.iterator();
        for (int j = 0 ; j < visitedZeroOnColumns.size(); j++){
            Integer column = iterator.next();
            for (int k = 0 ; k < rowLen ; k++){
                matrix[k][column] = 0;
            }
        }


    }
}
