package arrays.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRepeating {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 6, 7, 5, 7};
        int[] result = findMissingRepeatingNumbers(arr);
        System.out.println(Arrays.toString(result));
    }

    //optimal
    // think of this again and again and again
    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int actualSum = (nums.length * (nums.length + 1)) / 2;
        long actualSumSquare = 0;
        int currentSum = 0;
        long currentSumSquare = 0;
        for (int num : nums) {
            currentSum += num;
            currentSumSquare += (long) Math.pow(num, 2);
        }
        for (int i = 1; i <= nums.length; i++) {
            actualSumSquare += (long) Math.pow(i, 2);
        }
        long val1 = currentSum - actualSum;

        long val2 = currentSumSquare - actualSumSquare;

        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[] {(int) x, (int) y};
    }

    //better
//    public static int[] findMissingRepeatingNumbers(int[] nums) {
//        Arrays.sort(nums);
//        int lastVisited = -1;
//        int actualSum = (nums.length * (nums.length + 1)) / 2;
//        int currentSum = 0;
//        int[] result = new int[2];
//        for (int num : nums) {
//            currentSum += num;
//        }
//        for (int num : nums) {
//            if (num != lastVisited) {
//                lastVisited = num;
//            } else {
//                result[0] = num;
//                break;
//            }
//        }
//        result[1] = actualSum - (currentSum - lastVisited);
//
//        return result;
//    }

    //brute
//    public static int[] findMissingRepeatingNumbers(int[] nums) {
//        // Arrays.sort(nums);
//        List<Integer> visited = new ArrayList<>();
//        int lastVisited = -1;
//        int actualSum = (nums.length * (nums.length + 1)) / 2;
//        int currentSum = 0;
//        int[] result = new int[2];
//        for (int num : nums) {
//            currentSum += num;
//        }
//        for (int num : nums) {
//            if (!visited.contains(num)) {
//                visited.add(num);
//            } else {
//                lastVisited = num;
//                result[0] = num;
//                break;
//            }
//        }
//        result[1] = actualSum - (currentSum - lastVisited);
//
//        return result;
//    }
}
