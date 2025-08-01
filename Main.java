
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(10);
        list.add(0);
        list.add(3);
        System.out.println(helper(list,0,list.size()-2));
    }
    public static boolean helper(ArrayList<Integer> nums, int ind, int len) {
        if (ind == len) {
            if (nums.get(ind) > nums.get(ind + 1)) return false;
            return true;
        }
        if (nums.get(ind) > nums.get(ind + 1)) return false;
        return helper(nums, ind + 1, len);
    }
}
