package recursion;

import java.util.ArrayList;

public class ReverseString {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        //your code goes here
        return helper(s,new ArrayList<>(),s.size()-1);
    }
    public ArrayList<Character> helper(ArrayList<Character> s, ArrayList<Character> list, int ind) {
        if(ind==0) {
            list.add(s.get(ind));
            return list;
        }
        list.add(s.get(ind));
        return helper(s,list,ind-1);
    }
}
