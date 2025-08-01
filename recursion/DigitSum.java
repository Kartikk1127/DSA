package recursion;

public class DigitSum {
    public int helper(int num) {
        if (num<10) return num;

        int lastDigit = num % 10;
        num /= 10;
        num += lastDigit;
        return helper(num);
    }
}
