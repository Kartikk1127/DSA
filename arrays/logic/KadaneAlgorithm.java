package arrays.logic;

public class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (currentSum < 0) {
                max = Math.max(max,currentSum);
                currentSum = 0;
            }
            else if (currentSum > max) {
                max = currentSum;
            }
        }
        return max;
    }
}
