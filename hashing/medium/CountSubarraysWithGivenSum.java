package hashing.medium;

public class CountSubarraysWithGivenSum {

    public static void main(String[] args) {
        int [] arr = {3,2,1,4};
        System.out.println(subarraySum(arr,6));
    }

    //brute force
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int temp = calculateSum(i, j, nums);
                if (temp == k) {
                    count ++;
                }
            }
        }
        return count;
    }

    public static int calculateSum(int start, int end, int[] nums) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }


}
