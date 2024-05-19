package InsertInterval57;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8})));
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
//        System.out.println("interval = " +
//                Arrays.deepToString(intervals));
        int[][] merged = new int[intervals.length + 1][2];
        int j = 0;
        for (int[] i : intervals){
            merged[j][0] = i[0];
            merged[j][1] = i[1];
            j++;
        }
        merged[merged.length - 1] = newInterval;
        Arrays.sort(merged, Comparator.comparingInt(a -> a[0]));

//        System.out.println(Arrays.deepToString(merged));
        List<int[]> list = new ArrayList<>();

        int start = merged[0][0];
        int end = merged[0][1];

        for (int i = 1; i < merged.length ; i++){
            if (end >= merged[i][0]){
                if (end < merged[i][1]){
                    end = merged[i][1];
                }
                continue;
            }

            list.add(new int[]{start , end});
            start = merged[i][0];
            end = merged[i][1];
        }

        list.add(new int[]{start , end});

        return list.toArray(new int[list.size()][]);
    }
}
