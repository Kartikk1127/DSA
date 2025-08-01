package recursion;

import java.util.ArrayList;

public class IsSorted {
    class Solution {
        public boolean isSorted(ArrayList<Integer> nums) {
            // your code goes here
            return helper(nums, 0);
        }

        public boolean helper(ArrayList<Integer> nums, int ind) {
            if (ind==nums.size()-1) return true;

            if (nums.get(ind) > nums.get(ind + 1)) return false;
            return helper(nums, ind + 1);
        }
    }

}
