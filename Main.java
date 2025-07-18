public class Main {
    public static void main(String[] args) {
        pattern21(5);
    }
    public static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int temp = 0; temp < n; temp++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
