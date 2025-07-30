package recursion;

public class HeadRecursion {
    static int count = 0;
    public static void main(String[] args) {
        printName("Raj");
    }

    private static void printName(String raj) {
        if(count==4) return;

        count++;
        printName(raj);
        System.out.println(raj);
    }
}

