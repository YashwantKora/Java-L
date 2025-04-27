// 20. Write a Java program to demonstrate finalize() method.

public class _finalize {
    public static void main(String[] args) {
        String s = "Hello";
        s = null;
        System.gc();
        System.out.println("Garbage Collector");
    }
    protected void _finalize() {
        System.out.println("finalize() method called");
    }
 
}    


