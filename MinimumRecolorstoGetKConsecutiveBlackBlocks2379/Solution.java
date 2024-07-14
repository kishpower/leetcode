package MinimumRecolorstoGetKConsecutiveBlackBlocks2379;

public class Solution {
    public int minimumRecolors(String blocks, int k)   {
        int n = blocks.length();
        int wCount = 0;
        for (int i = 0; i < k; i++){
            if (blocks.charAt(i) == 'W') wCount++;
        }
        int ans = wCount;

        for(int j = k ; j < n;j++){
            if(blocks.charAt(j) == 'W') wCount++;
            if(blocks.charAt(j - k) == 'W') wCount--;
            ans = Math.min(ans, wCount);
        }

        return ans;
    }

}
