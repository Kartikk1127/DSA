package arrays.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 1, 1, 3, 2};
        System.out.println(majorityElementTwo(arr));
    }
    public static List<Integer> majorityElementTwo(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int num : nums) {
            if (!frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
                if (frequencyMap.get(num) > nums.length / 3) {
                    if(!result.contains(num)) {
                        result.add(num);
                    }
                }
            }
        }
        return result;
    }
}
