
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String temp = "12";
//        System.out.println(temp.substring(0,1));
        String [] str = {"flowers","flight","fly","flow"};
        longestCommonPrefix(str);
    }

    public static void longestCommonPrefix(String[] str) {
        //your code goes here
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}
