package ZigzagConversion6;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",  3));
    }


//   using concat(immutable) takes longer and consumes more memory , instead use StringBuilder(mutable)
//   General rule : when doing string concatenation in a loop , prefer mutable solutions like StringBuilder.
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        String ans = "";
        int n = s.length();
        int diff = 2 * numRows - 2;
        int diagonalDiff;
        int index;
        int secondIndex;

        for(int i = 0 ; i < numRows ; i++){
            index = i;

            while(index < n){
                ans+=s.charAt(index);

                if (i > 0 && i < numRows - 1){
                    diagonalDiff = diff - 2 * i;
                    secondIndex = index + diagonalDiff;

                    if (secondIndex < n){
                        ans+=s.charAt(secondIndex);
                    }
                }

                index += diff;
            }
        }

        return ans;
    }
}
