
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("hannah"));;
    }
    public static boolean palindromeCheck(String s) {
        // your code goes here
        StringBuilder reversed = new StringBuilder();
        int low = 0;
        int high = s.length() - 1;
        while (high >= 0) {
            char higher = s.charAt(high);
            reversed.append(higher);
            high--;
        }
        return reversed.toString().equals(s);
    }
}
