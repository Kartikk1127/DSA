package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        Collections.sort(al, new Comparator<Integer>() {
            // [num1, num2]
            @Override
            public int compare(Integer num1, Integer num2) {
                if (num1< num2) {
                    return 1; // positive integer means reverse the order.
                }
                else if (num1 > num2) {
                    return -1;
                }
                return 0;
            }
        });
//        Collections.sort(al, (num1, num2) -> num2 - num1);
        System.out.println(al);
    }
}
