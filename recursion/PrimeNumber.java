package recursion;

public class PrimeNumber {
    public boolean checkPrime(int num) {
        //your code goes here
        if(num==1) return false;
        return helper(num,1);
    }
    public boolean helper(int num, int i) {
        if(i>num/2) return true;
        if(i==1 || i==num) return helper(num,i+1);
        if(num%i==0) return false;
        return helper(num,i+1);
    }
}
