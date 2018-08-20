package test;

public class ReturnKeywordTest {

    public static void main(String[] args) {
        int result = add(0, 0);
        System.out.println("Result: " + result);
    }

    public static int add(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("You must provide non-zero values");
            return 0;
        }
        return a + b;
    }
}
