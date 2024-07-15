package CountVowelSubstrings2062;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
    private static final Set<Character> VOWEL_SET = new HashSet<>();

    static {
        for (char v : VOWELS) {
            VOWEL_SET.add(v);
        }
    }

    public int countVowelSubstrings(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            Set<Character> foundVowels = new HashSet<>();
            for (int j = i; j < word.length(); j++) {
                char c = word.charAt(j);
                if (VOWEL_SET.contains(c)) {
                    foundVowels.add(c);
                    if (foundVowels.size() == 5) {
                        count++;
                    }
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
