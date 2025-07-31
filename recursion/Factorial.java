package recursion;

public class Factorial {
    long fact = 1;
    public long factorial(int n) {
        //your code goes here
        if(n==0) {
            return fact;
        }
        fact*=n;
        return factorial(n-1);
    }
}
