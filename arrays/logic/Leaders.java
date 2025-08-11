package arrays.logic;

import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {
        ArrayList<Integer> result = leaders(new int[] {546,346});
        System.out.println(result);
    }
    public static ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[nums.length-1]);
        for(int i = nums.length-2; i >= 0; i--) {
            if(nums[i]>list.get(list.size()-1)) {
                list.add(nums[i]);
            }
        }
        reverseList(list);
        return list;
    }
    public static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size()-1;
        while(i < j) {
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}
