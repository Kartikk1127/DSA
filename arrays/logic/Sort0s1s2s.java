package arrays.logic;

public class Sort0s1s2s {
    public void sortZeroOneTwo(int[] nums) {
        int zeroes = 0, ones = 0, twos = 0, count = 0;
        for (int num : nums) {
            if (num == 0) zeroes++;
            else if (num == 1) ones++;
            else twos++;
        }
        while (zeroes > 0) {
            nums[count++] = 0;
            zeroes--;
        }
        while (ones > 0) {
            nums[count++] = 1;
            ones--;
        }
        while (twos > 0) {
            nums[count++] = 2;
            twos--;
        }
    }
}
