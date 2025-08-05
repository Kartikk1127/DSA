package sorting.algorithms;

public class InsertionSort {
    public int[] insertionSort(int[] nums) {
        for(int i = 1; i < nums.length; i ++) {
            int j = i-1;
            while(j >= 0 && nums[j+1]<nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                j--;
            }
        }
        return nums;
    }
}
