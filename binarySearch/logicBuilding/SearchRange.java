package binarySearch.logicBuilding;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int starting = search(nums, target, true);
        int ending = search(nums, target, false);
        return new int[]{starting, ending};
    }
    public int search(int [] nums, int target , boolean isTrue) {
        int low = 0, high = nums.length - 1, potentialIndex = -1;
        while(low<=high) {
            int mid = low + (high - low)/2;
            if(nums[mid] == target) {
                potentialIndex = mid;
                if(isTrue) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid]>target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return potentialIndex;
    }
}
