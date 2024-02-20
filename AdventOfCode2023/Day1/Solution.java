package AdventOfCode2023.Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File(System.getProperty("user.dir")+"/AdventOfCode2023/Day1/input.txt");
        Scanner scanner = new Scanner(input);
//        System.out.println(input.canRead());
        ArrayList<String> values = new ArrayList<>();
        while (scanner.hasNextLine()){
            values.add(scanner.nextLine());
        }
        int valuesSize = values.size();
//        part1(values, valuesSize);
        part2(values,valuesSize);

    }

    private static void part2(ArrayList<String> values, int valuesSize) {
        String[] lines = {
                "two1nine",
                "eightwothree",
                "abcone2threexyz",
                "xtwone3four",
                "4nineeightseven2",
                "zoneight234",
                "7pqrstsixteen"
        };

        int calibrationValues = 0;
        for (String line : lines) {
            Pattern pattern = Pattern.compile("(\\d).*?(\\d)");
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                int firstDigit = Integer.parseInt(matcher.group(1));
                int lastDigit = Integer.parseInt(matcher.group(2));
                calibrationValues += (10 * firstDigit + lastDigit);
            }
        }        System.out.println("Calibration values: " + calibrationValues);
    }

    private static void part1(ArrayList<String> values, int valuesSize) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i< valuesSize; i++){
            String value = values.get(i);
            int length = value.length();
            char num1 = 0,num2 = 0;
            for (int j= 0 ; j < length ; j++){
                if(value.charAt(j) >= 47 && value.charAt(j) <= 57){
                    num1 = value.charAt(j);
                    break;
                }
            }

            for (int k= length -1 ; k >= 0; k--){
                if(value.charAt(k) >= 47 && value.charAt(k) <= 57){
                    num2 = value.charAt(k);
                    break;
                }
            }
            result.add("" + num1 + num2)
            ;
        }
        System.out.println(result.stream().map(Integer::parseInt).reduce(0,(a , b) -> a + b ));
    }
}
