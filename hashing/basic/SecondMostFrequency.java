package hashing.basic;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondMostFrequency {
    public int secondMostFrequentElement(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> frequency = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }
        int maxFrequencyElement = -1;
        int maxFrequencyCount = 0;

        int secondMostFrequentElement = -1;
        int secondMostFrequentCount = 0;
        for (Map.Entry<Integer, Integer> mp : frequency.entrySet()) {
            if (mp.getValue() > maxFrequencyCount) {
                secondMostFrequentCount = maxFrequencyCount;
                secondMostFrequentElement = maxFrequencyElement;
                maxFrequencyElement = mp.getKey();
                maxFrequencyCount = mp.getValue();
            } else if (mp.getValue() > secondMostFrequentCount && mp.getValue() < maxFrequencyCount) {
                secondMostFrequentElement = mp.getKey();
                secondMostFrequentCount = mp.getValue();
            }
        }
        return secondMostFrequentElement;
    }
}
