package arrays.logic;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1 {
    public static void main(String[] args) {
        int [] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityElement(arr));
    }

    //optimal
    // This is moore's voting algorithm explained
    // You take a count=0 and an element=current element.
    // This is our potential answer since at index 0(current element is itself the majority element).
    // As we move forward, if the next elements are same we increase the count else we decrease the count.
    //By the index the count reaches 0, we know that the element we have as of now isn't the majority element else the count won't be zero.
    // This means, that till the time the count  remains >0, the element we have is the majority element.
    // We do this till the end  of the array and this will help us fetch the correct output.
    public static int majorityElement(int [] arr) {
        int count = 1;
        int element = arr[0];
        for(int i = 1; i < arr.length; i ++) {
            if (count==0) {
                element = arr[i];
            }
            if(arr[i]==element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
    // less optimized
//    public static int majorityElement(int[] nums) {
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//        int count = 0;
//        for (int num : nums) {
//            if (!frequencyMap.containsKey(num)) {
//                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//            } else {
//                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//                if (frequencyMap.get(num) > nums.length / 2) return num;
//            }
//        }
//        return -1;
//    }
}
