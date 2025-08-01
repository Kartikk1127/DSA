package recursion;

public class Fibonacci {
    public int helper(int n) {
        if(n<=1) return n;
        return helper(n-1) + helper(n-2);
    }
}
