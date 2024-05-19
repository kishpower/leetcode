package MergeIntervals56;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{2,6},{1,3},{8,10},{15,18}})));
    }

    public static int[][] merge(int[][] intervals) {
        //sort the 2d array
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> list = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1; i < intervals.length ; i++){
           if (end >= intervals[i][0]){
               if (end <= intervals[i][1]){
                   end = intervals[i][1];
               }
               continue;
           }

           list.add(new int[]{start , end});
           start = intervals[i][0];
           end = intervals[i][1];

        }

        list.add(new int[]{start, end});

        int[][] result = new int[list.size()][2];
        int j = 0;

        for (int[] i:list){
           result[j][0] = i[0];
           result[j][1] = i[1];
           j++;
        }

        return result;
    }
}
