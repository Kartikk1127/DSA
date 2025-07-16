public class Pattern16 {
    public void pattern16(int n) {
        for(int i = 1; i <= n; i ++) {
            for(int j = 0; j < i; j++) {
                char ch = (char) (i+64);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
