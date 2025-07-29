package string;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        // your code goes here
        if (s.length() != goal.length()) return false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(0, i + 1);
            sb.append(s.substring(i + 1)).append(str);
            if (sb.toString().equals(goal)) return true;
            sb.setLength(0);
        }
        return false;
    }
}
