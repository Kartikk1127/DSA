package arrays.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    List<Integer> list = new ArrayList<>();
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (right > left && nums[right] == nums[right + 1]) right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
                while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
            }
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
        }
        return result;
    }
}
