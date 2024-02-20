package TechVerito.ReverseSentence;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseSentence("today is tuesday"));
    }
    public static String reverseSentence(String given){
        if (given == "") return "";
        String[] tokens = given.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = tokens.length -1 ; i>0; i--){
           output.append(tokens[i] + " ");
        }

        return  output.append(tokens[0]).toString();
    }
}
