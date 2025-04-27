//5. Write a Java program to demonstrate static variable.

class __static {
    static int a = 1;
    static int b = 23;
    static void random_method() {
        System.out.println("a = " + a);
    }
}
public class _static {
    public static void main(String[] args) {
        __static.random_method();
        System.out.println("B =" + ' ' + __static.b);
    }
}