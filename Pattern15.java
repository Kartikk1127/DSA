public class Pattern15 {
    public void pattern15(int n) {
        for(int i = n; i > 0; i --) {
            for(int j = 0; j < i; j++) {
                char ch = (char) (j+65);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
