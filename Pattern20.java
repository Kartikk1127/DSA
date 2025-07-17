public class Pattern20 {
    public void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < 2 * (n - i - 1); k++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
            if (i == n - 1) {
                for (int temp = i; temp > 0; temp--) {
                    for (int a = 0; a < temp; a++) {
                        System.out.print("*");
                    }
                    for (int b = 0; b < 2 * (n - temp); b++) {
                        System.out.print(" ");
                    }
                    for (int c = 0; c < temp; c++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}
