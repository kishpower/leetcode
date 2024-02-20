package IsomorphicStrings205;



public class Solution {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add","geg"));;
    }
    public static boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[200];
        int[] map2 = new int[200];
        for (int i=0;i<s.length();i++){
            int c = s.charAt(i);
            int c1 = t.charAt(i);
            if (map1[c]!=map2[c1]) return false;

            map1[c]=i+1;
            map2[c1]=i+1;
        }
        return true;
    }

//    public boolean isIsomorphic(String s, String t) {
//        Map<Character, Character> map = new HashMap<>();
//        Set<Character> set = new HashSet<>();
//        int n = s.length() - 1;
//
//        while (n >= 0) {
//            if (map.containsKey(s.charAt(n)) && map.get(s.charAt(n)) != t.charAt(n)) {
//                return false;
//            }
//            if (!map.containsKey(s.charAt(n)) && set.contains(t.charAt(n))) {
//                return false;
//            }
//            set.add(t.charAt(n));
//            map.put(s.charAt(n), t.charAt(n));
//            n--;
//        }
//
//        return true;
//    }
}
