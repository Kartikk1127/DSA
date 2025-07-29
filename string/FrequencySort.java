package string;

import java.util.*;

public class FrequencySort {
    public List<Character> frequencySort(String s) {
        // Your code goes here
        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort(
                new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(
                            Map.Entry<Character, Integer> entry1, Map.Entry<Character, Integer> entry2) {
                        if (!entry1.getValue().equals(entry2.getValue())) {
                            return entry2.getValue().compareTo(entry1.getValue());
                        }
                        return entry1.getKey().compareTo(entry2.getKey());
                    }
                });
        List<Character> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> characterIntegerEntry : list) {
            char ch = characterIntegerEntry.getKey();
            result.add(ch);
        }
        return result;
    }
}
