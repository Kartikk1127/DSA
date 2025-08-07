package arrays.fundamentals;

public class RotateArrayByKPlaces {
    public void rotateArray(int[] nums, int k) {
        k=k%nums.length;
        int temp [] = new int[k];
        for(int j = 0; j < k ; j ++) {
            temp[j] = nums[j];
        }
        for (int i = 0; i < nums.length - k; i++) {
            nums[i] = nums[i + k];
        }
        int count = nums.length - k ;
        int ind = 0;
        while(ind < temp.length) {
            nums[count++] = temp[ind++];
        }
    }
}
