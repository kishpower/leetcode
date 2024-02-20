package HIndex274;

public class Solution {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[] {3,0,6,1,5}));
    }
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] buckets = new int[n + 1];
        int count = 0;
        for (int c: citations){
            if (c >= n) {
                buckets[n]++;
            }else {
                buckets[c]++;
            }
        }

        for (int i = n ; i>= 0 ; i--){
            count += buckets[i];

            if (count >= i) return i;
        }

        return 0;
    }
}
