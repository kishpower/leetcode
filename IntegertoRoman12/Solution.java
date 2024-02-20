package IntegertoRoman12;

public class Solution {
    public static void main(String[] args) {
        System.out.println(intToRoman(2000));
    }
    public static String intToRoman(int num) {
        String ans = "";
        char[] ch1 = {'I' , 'X' , 'C' , 'M'};
        char[] ch2 = {'V' , 'L' , 'D'};
        char[] ch3 = {'X' , 'C' , 'M'};

        int i = 0;
        while(num > 0){
            int seg = num % 10;
            String temp = "";
            switch (seg){
                case 1: temp = temp + ch1[i];
                        break;
                case 2: temp = temp + ch1[i] + ch1[i];
                        break;
                case 3: temp = temp + ch1[i] + ch1[i] + ch1[i];
                        break;
                case 4: temp = temp + ch1[i] + ch2[i];
                        break;
                case 5: temp = temp + ch2[i];
                        break;
                case 6: temp = temp + ch2[i] + ch1[i];
                        break;
                case 7: temp = temp + ch2[i] + ch1[i] + ch1[i];
                        break;
                case 8: temp = temp + ch2[i] + ch1[i] + ch1[i] + ch1[i];
                        break;
                case 9: temp = temp + ch1[i] + ch3[i];
                        break;
                default: // when seg is  0 or otherwise
                        break;
            }
            num /= 10;
            i++;
            ans = temp + ans;
        }
        return ans;
    }

}
