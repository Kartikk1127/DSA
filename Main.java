import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        System.out.println(Arrays.toString(list.toArray()));
    }
    public static int[] divisors(int n) {
        List<Integer> resultList = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n%i==0) {
                resultList.add(i);
            }
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
