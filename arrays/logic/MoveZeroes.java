package arrays.logic;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int ind = 0;
        int countZeros = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(nums[i]!=0) {
                nums[ind++] = nums[i];
            } else {
                countZeros++;
            }
        }
        while(countZeros > 0) {
            nums[nums.length-countZeros] = 0;
            countZeros--;
        }
    }
}
