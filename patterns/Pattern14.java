package patterns;

public class Pattern14 {
    public void pattern14(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                char ch = (char) (j+65);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
