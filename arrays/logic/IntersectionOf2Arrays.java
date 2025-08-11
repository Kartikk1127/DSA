package arrays.logic;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOf2Arrays {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i]==nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i]<nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result.stream().mapToInt(element -> element).toArray();
    }
}
