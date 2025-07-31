package recursion;

public class SumArray {
    int sum = 0;
    public int arraySum(int[] nums) {
        //your code goes here
        return calculateSum(0,nums);
    }
    public int calculateSum(int ind, int [] nums) {
        if(ind==nums.length) {
            return sum;
        }
        sum+=nums[ind];
        return calculateSum(ind+1,nums);
    }
}
