package LengthofLastWord58;

public class Solution {
    public static void main(String[] args) {
        lengthOfLastWord("   fly me   to   the moon  ");
    }
    public static int lengthOfLastWord(String s) {
        int i =s.length()-1;
        int count = 0;
        while (s.charAt(i) == ' '){
            i--;
        }
        while(s.charAt(i) != ' '){
            count++;
            i--;
        }

        System.out.println("count = " + count);
        return count;
    }
}
