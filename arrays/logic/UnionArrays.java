package arrays.logic;

import java.util.ArrayList;
import java.util.List;

public class UnionArrays {
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i]<=nums2[j]) {
                insertInList(nums1[i],resultList);
                i++;
            } else {
                insertInList(nums2[j],resultList);
                j++;
            }
        }
        while(i < nums1.length) {
            insertInList(nums1[i++],resultList);
        }
        while(j < nums2.length) {
            insertInList(nums2[j++],resultList);
        }
        return resultList.stream().mapToInt(k -> k).toArray();
    }
    public void insertInList(int num, List<Integer> list) {
        if(!list.contains(num)) {
            list.add(num);
        }
    }
}
