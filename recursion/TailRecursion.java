package recursion;

public class TailRecursion {
    static int count = 0;
    public static void main(String[] args) {
        printName("Raj");
    }

    private static void printName(String raj) {
        if(count==4) return;

        System.out.println(raj);
        count++;
        printName(raj);
    }
}
