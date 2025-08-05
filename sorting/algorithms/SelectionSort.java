package sorting.algorithms;

import java.util.Vector;

public class SelectionSort {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        nums.add(7);
        nums.add(4);
        nums.add(1);
        nums.add(5);
        nums.add(3);

        Vector<Integer> sortedArray = sort(nums);
        System.out.println(sortedArray);
    }

    private static Vector<Integer> sort(Vector<Integer> nums) {
        for(int i = 0; i < nums.size(); i ++) {
            int min = Integer.MAX_VALUE;
            int minInd = -1;
            for(int j = i; j < nums.size(); j ++) {
                if(nums.get(j) < min) {
                    min = nums.get(j);
                    minInd = j;
                }
            }
            int temp = nums.get(i);
            nums.set(i,min);
            nums.set(minInd,temp);
        }
        return nums;
    }
}
