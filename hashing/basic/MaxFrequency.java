package hashing.basic;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxFrequency {
    public int mostFrequentElement(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> frequency = new LinkedHashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        int maxFrequencyElement = 0;
        int maxFrequencyCount = 0;
        for(Map.Entry<Integer, Integer> mp : frequency.entrySet()) {
            if(mp.getValue() > maxFrequencyCount) {
                maxFrequencyElement = mp.getKey();
                maxFrequencyCount = mp.getValue();
            }
        }
        return maxFrequencyElement;
    }
}
