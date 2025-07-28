package string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] str) {
        //your code goes here
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length-1];
        StringBuilder lcp = new StringBuilder();
        for(int i = 0; i < Math.min(s1.length(),s2.length()); i ++) {
            if(s1.charAt(i)!=s2.charAt(i)) return lcp.toString();
            lcp.append(s1.charAt(i));
        }
        return lcp.toString();
    }
}
