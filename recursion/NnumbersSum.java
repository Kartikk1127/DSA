package recursion;

public class NnumbersSum {
    int sum = 0;
    public int NnumbersSum(int n) {
        //your code goes here
        if(n==0) {
            return sum;
        }
        sum+=n;
        return NnumbersSum(n-1);
    }
}
