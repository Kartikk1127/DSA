package arrays.logic;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> idxMap = new HashMap<>();
        int [] result = new int[2];
        for(int i = 0;  i < nums.length; i ++) {
            if(idxMap.containsKey(target - nums[i])) {
                int idx1 = idxMap.get(target-nums[i]);
                result[0] = idx1;
                result[1] = i;
            } else {
                idxMap.put(nums[i],i);
            }
        }
        return result;
    }
}
