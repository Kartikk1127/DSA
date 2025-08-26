package hashing.basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class SumHighestAndLowestFrequency {
    public static void main(String[] args) {
        int [] arr = {5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000,5000};
        System.out.println(sumHighestAndLowestFrequency(arr));
    }
    /*public int sumHighestAndLowestFrequency(int[] nums) {
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
    }*/

    public static int sumHighestAndLowestFrequency(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        int[] freqArray = new int[max + 1];
        for (int num : nums) {
            freqArray[num] += 1;
        }
        int maxFreq = -1;
        int minFreq = Integer.MAX_VALUE;
        for (int i = 0; i < freqArray.length; i++) {
            if (freqArray[i] > 0) {
                if (freqArray[i] > maxFreq) {
                    maxFreq = freqArray[i];
                }
                if (freqArray[i] < minFreq) {
                    minFreq = freqArray[i];
                }
            }
        }
        return maxFreq + minFreq;
    }
}
