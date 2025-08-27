package hashing.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr = {-19,-9,15,2,7,16,11,-16,2,13,-8,2,1,16,18,-5,-13,-14,-9,-2,9,12,7,-1,15,-6,3,-9};
        System.out.println(longestConsecutive(arr));
    }
    // not the optimal solution
//    public static int longestConsecutive(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        for(int num : nums) {
//            if(num>max) {
//                max = num;
//            }
//        }
//        int [] freqArray = new int[max+1];
//        for(int num : nums) {
//            freqArray[num] += 1;
//        }
//        int longestConsecutive = 0, currentCount = 0;
//        for (int j : freqArray) {
//            if (j > 0) {
//                currentCount++;
//            } else {
//                longestConsecutive = Math.max(longestConsecutive, currentCount);
//                currentCount = 0;
//            }
//        }
//        return Math.max(longestConsecutive, currentCount);
//    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int count = 1, maxCount = Integer.MIN_VALUE;
        for(int num : nums) {
            st.add(num);
        }
        for(int num : nums) {
            if(!st.contains(num-1)) {
                int currentElement = num;
                while(st.contains(currentElement+1)) {
                    count++;
                    currentElement++;
                }
                maxCount = Math.max(maxCount,count);
                count = 1;
            }
        }
        return Math.max(count, maxCount);
    }
}
