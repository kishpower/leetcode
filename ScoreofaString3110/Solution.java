package ScoreofaString3110;

class Solution {
    public int scoreOfString(String s) {
        char[] charArray = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < charArray.length - 1 ; i++){
           sum += Math.abs(charArray[i] - charArray[i+1]);
        }

        return sum;
    }
}