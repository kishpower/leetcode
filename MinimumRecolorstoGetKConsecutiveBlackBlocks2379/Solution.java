package MinimumRecolorstoGetKConsecutiveBlackBlocks2379;

public class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int result = k;
        for (int i = 0; i <= n - k ; i++){
            int wCount = 0;
            String subString = blocks.substring(i, i + k);
            for (char c :subString.toCharArray()){
                if (c == 'W') wCount++;
            }
            result = Math.min(result, wCount);
            if (result == 0) return result;
        }

        return result;
    }
}
