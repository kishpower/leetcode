package AddBinary67;

public class Solution {

    public static void main(String[] args) {
        System.out.println(        addBinary( "111" , "0")
        );
    }

    public static String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        String result = "";
        while(i >=0 || j>=0 || carry == 1){
            if (i>=0){
                carry += a.charAt(i--) - '0';
            }

            if (j>=0){
                carry += b.charAt(j--) - '0';
            }

            result = (carry % 2) + result;
            carry /= 2;
        }

        return result;
    }

}
