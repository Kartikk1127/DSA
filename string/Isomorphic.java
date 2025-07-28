package string;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public boolean isomorphicString(String s, String t) {
        // your code goes here
        if (s.length() != t.length()) return false;
        Map<Character, Character> mp1 = new HashMap<>();
        Map<Character, Character> mp2 = new HashMap<>();
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (!mp1.containsKey(s.charAt(i)) && !mp2.containsKey(t.charAt(j))) {
                mp1.put(s.charAt(i), t.charAt(j));
                mp2.put(t.charAt(j), s.charAt(i));
            } else {
                if (mp1.containsKey(s.charAt(i))) {
                    if (t.charAt(j) != mp1.get(s.charAt(i))) return false;
                }
                if (mp2.containsKey(t.charAt(j))) {
                    if (s.charAt(i) != mp2.get(t.charAt(j))) return false;
                }
            }
            i++;
            j++;
        }
        return true;
    }
}
