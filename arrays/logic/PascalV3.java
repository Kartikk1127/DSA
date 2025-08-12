package arrays.logic;

import java.util.ArrayList;
import java.util.List;

public class PascalV3 {
    public static void main(String[] args) {
        System.out.println(pascalTriangleIII(4));
    }
    public static List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i ++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < i + 1; j ++) {
                if(j==0 || j == i) {
                    list.add(1);
                } else {
                    list.add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
                }
            }
            result.add(list);
        }
        return result;
    }
}
