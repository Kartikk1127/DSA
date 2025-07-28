package string;

public class LargestOdd {
    public String largeOddNum(String s) {
        // your code goes here
        if (s.isEmpty()) return "";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                str.append(s.substring(i));
                break;
            }
        }
        String input = str.toString();
        for (int i = input.length() - 1; i >= 0; i--) {
            if ((input.charAt(i) - '0') % 2 != 0) return input.substring(0, i + 1);
        }
        return "";
    }
}
