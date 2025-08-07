package arrays.logic;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            nums[count++] = nums[i];
            if (nums[i + 1] == nums[i]) {
                while(i+1<nums.length && nums[i+1]==nums[i]) {
                    i += 1;
                }
            }
        }

        if(nums[nums.length-2] != nums[nums.length-1]) nums[count++] = nums[nums.length-1];

        return count;
    }
    public int removeDuplicatesV2(int[] nums) {
        int i = 0, j = 1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
            j++;
        }
        return i+1;
    }
}
