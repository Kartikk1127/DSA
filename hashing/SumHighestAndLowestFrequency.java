package hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class SumHighestAndLowestFrequency {
    public int sumHighestAndLowestFrequency(int[] nums) {
        Map<Integer, Integer> frequency = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> mp : frequency.entrySet()) {
            if(mp.getValue() < lowest) {
                lowest = mp.getValue();
            }
            if(mp.getValue() > highest) {
                highest = mp.getValue();
            }
        }
        return lowest+highest;
    }
}
