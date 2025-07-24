package collections;

import java.util.ArrayDeque;

public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(2);
        ad.offer(3);
        ad.offer(4);
        ad.offer(5);
        System.out.println(ad);
        ad.poll();
        System.out.println(ad.peek());
    }
}
