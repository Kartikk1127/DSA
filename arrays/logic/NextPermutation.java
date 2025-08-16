package arrays.logic;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int [] arr = {1,3,2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums) {
        boolean willChange = false;
        // Your code goes here
        for(int i = nums.length-2; i >= 0; i--) {
            if(nums[i]<nums[i+1]) {
                willChange = true;
                int idxToSwap = getSmallestElementGreaterThanCurrent(nums,nums[i],i);
                int temp = nums[i];
                nums[i] = nums[idxToSwap];
                nums[idxToSwap] = temp;
                int left = i+1;
                int right = nums.length-1;
                while(left<right) {
                    int ind = nums[left];
                    nums[left] = nums[right];
                    nums[right] = ind;
                    left++;
                    right--;
                }
                break;
            }
        }
        if(!willChange) Arrays.sort(nums);
    }

    private static int getSmallestElementGreaterThanCurrent(int[] nums, int target, int start) {
        int minIdx = start+1;
        for(int i = start+1; i < nums.length; i ++) {
            if(nums[i]>target && nums[i]<=nums[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }
}
