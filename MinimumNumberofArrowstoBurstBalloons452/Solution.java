package MinimumNumberofArrowstoBurstBalloons452;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}));
        System.out.println(findMinArrowShots(new int[][]{{1,9},{7,16},{2,5},{7,12},{9,11},{2,10},{9,16},{3,9},{1,3}}));
    }
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points , Comparator.comparingInt(a -> a[1]));
        System.out.println(Arrays.deepToString(points));
        int end = points[0][1];

        int count = 1;
        for(int i = 1 ; i < points.length ; i++){
                if (end < points[i][0]){
                    count++;
                    end = points[i][1];
                }
        }
        return count;
    }
}
