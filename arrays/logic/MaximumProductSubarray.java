package arrays.logic;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int prefixProd = 1;
        int suffixProd = 1;
        int prefixInd = 0;
        int suffixInd = nums.length -1;
        int maxProd = Integer.MIN_VALUE;
        while(prefixInd<nums.length && suffixInd>=0) {
            prefixProd *= nums[prefixInd];
            suffixProd *= nums[suffixInd];
            maxProd = Math.max(maxProd,Math.max(prefixProd,suffixProd));
            if(prefixProd==0) prefixProd = 1;
            if(suffixProd==0) suffixProd = 1;
            prefixInd++;
            suffixInd--;
        }
        return maxProd;
    }
}
