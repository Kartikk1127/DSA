package hashing.medium;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithGivenSum {

    public static void main(String[] args) {
        int [] arr = {3,2,1,4};
        System.out.println(subarraySum(arr,6));
    }

    //brute force
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int temp = calculateSum(i, j, nums);
                if (temp == k) {
                    count ++;
                }
            }
        }
        return count;
    }

    public static int calculateSum(int start, int end, int[] nums) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }

    // better
    public static int subarraySumBetter(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count ++;
                }
            }
        }
        return count;
    }

    // optimal
    public static int subarraySumOptimal(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1);
        int count = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            if (countMap.containsKey(sum - k)) {
                count+=countMap.getOrDefault(sum-k,0);
            }
            countMap.put(sum, countMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }


}
