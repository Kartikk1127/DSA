package arrays.logic;

public class ReversePairs {
    private int count = 0;

    public int reversePairs(int[] nums) {
        int[] temp = new int[nums.length];
        helper(nums, 0, nums.length - 1, temp);
        return count;
    }

    public void helper(int[] nums, int left, int right, int[] temp) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        helper(nums, left, mid, temp);
        helper(nums, mid + 1, right, temp);
        compare(nums, left, mid, right);
        merge(nums, left, mid, right, temp);
    }

    public void merge(int[] nums, int left, int mid, int right, int[] temp) {
        int low = left;
        int high = mid + 1;
        int k = left;
        while (low <= mid && high <= right) {
            if (nums[low] <= nums[high]) {
                temp[k++] = nums[low++];
            } else {
                temp[k++] = nums[high++];
            }
        }
        while (low <= mid) {
            temp[k++] = nums[low++];
        }
        while (high <= right) {
            temp[k++] = nums[high++];
        }

        for (int i = left; i <= right; i++) {
            nums[i] = temp[i];
        }
    }

    public void compare(int[] nums, int low, int mid, int high) {
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) nums[i] > 2L * nums[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
    }
}
