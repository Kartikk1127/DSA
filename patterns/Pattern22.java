package patterns;

public class Pattern22 {
    public void pattern22(int n) {
        for(int i = 0; i < 2 * n - 1; i ++) {
            for(int j = 0; j < 2 * n -1 ; j ++) {
                int bottom = 2 * n - 2 - i;
                int right = 2 * n - 2 - j;

                int valueToBePrinted = n - Math.min(Math.min(i,bottom) , Math.min(j,right));
                System.out.print(valueToBePrinted + " ");
            }
            System.out.println();
        }
    }
}
