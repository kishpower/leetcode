package FindtheIndexoftheFirstOccurrenceinaString28;

public class Solution {
    public static void main(String[] args) {
        strStr("mississippi","issip");
    }

    public static int strStr(String haystack, String needle) {
        int hayStackLength = haystack.length();
        int needleLength = needle.length();
        int needleIndex = 0;

        for (int i=0;i<hayStackLength;i++){
            if (haystack.charAt(i)==needle.charAt(needleIndex)){
                needleIndex++;
            }else {
                i=i-needleIndex;
                needleIndex=0;
            }

            if (needleLength == needleIndex) return i-needleLength+1;

        }
        return -1;
    }
}
