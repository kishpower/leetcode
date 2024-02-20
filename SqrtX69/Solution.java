package SqrtX69;

public class Solution {
    public static void main(String[] args) {

        System.out.println(mySqrt(2147483647));
    }

    public static int mySqrt(int x) {
        if (x == 1) return 1;

        int start = 1;
        int end = x;
        int mid;

        while (start <= end){
            mid = start + (end - start)/2;

            if ((long)mid * mid > (long) x)
                end = mid - 1;
            else if((long)mid * mid < (long) x)
                start = mid + 1;
            else return mid;

        }
        return end;
    }
}
