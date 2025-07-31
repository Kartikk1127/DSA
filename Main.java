
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5})));
    }
    public static int[] reverseArray(int[] nums) {
        //your code goes here
        return helper(nums, new int[nums.length], 0, nums.length-1);
    }
    public static int[] helper(int [] nums, int [] result, int resInd, int oldInd) {
        if(oldInd==0) {
            result[resInd] = nums[oldInd];
            return result;
        }
        result[resInd] = nums[oldInd];
        return helper(nums, result, ++resInd, --oldInd);
    }
}
