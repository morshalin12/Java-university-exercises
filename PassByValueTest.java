package test;

public class PassByValueTest {

    public static void main(String[] args) {
        int x = 10;
        print(x);//Prints 10
        changeValue(x);
        print(x);//Prints 10
    }

    public static void print(int arg) {
        System.out.println("Received value:" + arg);
    }

    public static void changeValue(int i) {
        i = 200;
    }
}
