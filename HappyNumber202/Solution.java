package HappyNumber202;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
            isHappy(100);
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while(n!=1 && !seen.contains(n)){
            seen.add(n);

            int sum = 0;
            while (n!=0){
                int digit  = n%10;
                sum += digit*digit;
                n/=10;
            }

            n=sum;
        }

        return n==1;
    }
}
