package hashing.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithXorK {
    // brute force
    public int subarraysWithXorKBrute(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int xor = 0;
            for(int j = i; j < nums.length; j++) {
                xor = xor ^ nums[j];
                if(xor==k) count++;
            }
        }
        return count;
    }

    // optimal
    public int subarraysWithXorKOptimal(int[] nums, int k) {
        Map<Integer, Integer> xorMap = new HashMap<>();
        int xor = 0, count=0;
        xorMap.put(0,1);
        for(int num : nums) {
            xor = xor ^ num;
            if(xorMap.containsKey(k^xor)) {
                count += xorMap.getOrDefault(k^xor,0);
            }
            xorMap.put(xor, xorMap.getOrDefault(xor, 0)+1);
        }
        return count;
    }
}
