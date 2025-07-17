class Solution {

    public static void main(String[] args) {
        pattern17(5);
    }
    public static void pattern17(int n) {
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            printCharacters(i);
            System.out.println();
        }
    }
    public static void printCharacters(int limit) {
        for (int i = 0; i <= limit; i++) {
            char ch = (char) (i + 65);
            System.out.print(ch);
            if (i == limit && limit > 0) {
                for (int j = i-1; j >= 0; j--) {
                    System.out.print((char)(j+65));
                }
            }
        }
    }
}
