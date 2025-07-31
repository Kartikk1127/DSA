package recursion;

public class PalindromeCheck {
    public boolean palindromeCheck(String s) {
        //your code goes here
        return helper(s,new StringBuilder(),s.length()-1);
    }
    public boolean helper(String s, StringBuilder sb, int ind) {
        if(ind==0) {
            sb.append(s.charAt(ind));
            return sb.toString().equals(s);
        }
        sb.append(s.charAt(ind));
        return helper(s,sb,ind-1);
    }
}
