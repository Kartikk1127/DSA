
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String temp = "12";
//        System.out.println(temp.substring(0,1));
        System.out.println(largeOddNum("000050347"));
    }

    public static String largeOddNum(String s) {
        if (s.isEmpty()) return "";
        // your code goes here
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i ++) {
            if (s.charAt(i)!='0') {
                str.append(s.substring(i));
                break;
            }
        }
        String input = str.toString();
        for(int i = input.length()-1; i >= 0; i --) {
            if((input.charAt(i)-'0') %2 !=0) return input.substring(0,i+1);
        }
        return "";
    }
}
