package arrays.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 1, 1, 3, 2};
        System.out.println(majorityElementTwo(arr));
    }

    // most optimal
    // moore's voting algorithm
    public static List<Integer> majorityElementTwo(int[] nums) {
        int requiredCount = nums.length/3;
        List<Integer> list = new ArrayList<>();
        int count1 = 0, count2 =0, element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;

        for (int j : nums) {
            if (count1 == 0 && j != element2) {
                count1 = 1;
                element1 = j;
            } else if (count2 == 0 && j != element1) {
                count2 = 1;
                element2 = j;
            } else if (j == element1) count1++;
            else if (j == element2) count2++;
            else {
                count1--;
                count2--;
            }
        }
        int freqElement1 = 0;
        int freqElement2 = 0;
        for(int num : nums) {
            if(num == element1) freqElement1++;
            else if(num == element2) freqElement2++;
        }
        if(freqElement1>requiredCount) list.add(element1);
        if(freqElement2>requiredCount) list.add(element2);
        return list;
    }
    //less optimal
//    public static List<Integer> majorityElementTwo(int[] nums) {
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//        List<Integer> result = new ArrayList<>();
//        int count = 0;
//        for (int num : nums) {
//            if (!frequencyMap.containsKey(num)) {
//                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//                if (frequencyMap.get(num) > nums.length / 3) {
//                    if(!result.contains(num)) {
//                        result.add(num);
//                    }
//                }
//            }
//        }
//        return result;
//    }
}
