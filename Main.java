
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [] arrCopy = arr.clone();
        arrCopy[1] = 4;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrCopy));
        System.out.println(Arrays.toString(arr));
    }
}
