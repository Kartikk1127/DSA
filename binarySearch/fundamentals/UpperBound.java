package binarySearch.fundamentals;

public class UpperBound {
    public int upperBound(int[] nums, int x) {
        int potentialIndex = nums.length, low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= x) {
                low = mid + 1;
            } else {
                potentialIndex = mid;
                high = mid - 1;
            }
        }
        return potentialIndex;
    }
}
