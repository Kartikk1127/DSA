package string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {
    public boolean anagramStrings(String s, String t) {
        //your code goes here
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> mp1 = new HashMap<>();
        Map<Character,Integer> mp2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i),0)+1);
            mp2.put(t.charAt(i), mp2.getOrDefault(t.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> mp : mp1.entrySet()) {
            char key = mp.getKey();
            int value = mp.getValue();
            if(mp2.get(key) == null || value!=mp2.get(key)) return false;
        }
        return true;
    }
}
