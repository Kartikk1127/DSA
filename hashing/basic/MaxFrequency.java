package hashing.basic;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxFrequency {
    /*public int mostFrequentElement(int[] nums) {
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
    }*/
    public static void main(String[] args) {
        int [] nums = {100,200,200,300,300};
        int result = mostFrequentElement(nums);
        System.out.println(result);
    }

    public static int mostFrequentElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            max = Math.max(max,num);
        }
        int [] frequencyArray = new int[max+1];
        for(int num : nums) {
            frequencyArray[num] += 1;
        }
        int maxFrequency = 0;
        int maxElement = 0;
        for(int i = 0; i<frequencyArray.length; i++) {
            if(frequencyArray[i]>maxFrequency) {
                maxFrequency = frequencyArray[i];
                maxElement = i;
            }
        }
        return maxElement;
    }
}
