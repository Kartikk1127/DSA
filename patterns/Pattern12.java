package patterns;

public class Pattern12 {
    public void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            int spaces = 2 * (n - i);
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
