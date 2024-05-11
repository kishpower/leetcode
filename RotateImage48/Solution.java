package RotateImage48;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
    public static void rotate(int[][] matrix) {
        // transpose the matrix along -1 slope diagonal , then reverse columns to find the rotated matrix
        int n = matrix.length;

        // transposing the matrix
        for (int i = 1 ; i < n ; i++){
            for (int j = 0 ; j < i ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reversing the column order
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n/2 ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
    }
}
