package patterns;

public class Pattern18 {
    public void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                char ch = (char) (n + 65 - j - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
