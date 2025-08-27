package hashing.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    public static void main(String[] args) {
        int [] array = {1,2,3,-2,2,4,-1,1,2,-1};
        System.out.println(longestSubarray(array,5));
    }
    // brute force
/*    public static int longestSubarray(int[] nums, int k) {
        int count, max = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count = j - i + 1;
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        return max;
    }*/

    public static int longestSubarray(int[] nums, int k) {
        int len, max = 0, sum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                max = Math.max(max, i + 1);
            }
            else if (mp.containsKey(sum - k)) {
                len = i - mp.get(sum - k);
                max = Math.max(max, len);
            }
            if(!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }
        return max;
    }
}
