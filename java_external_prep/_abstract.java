//26. Write a Java program to demonstrate abstract class.

abstract class A {
    abstract void Show();
}
class B extends A {
    void Show() {
        System.out.println("Inside the Subclass!");
    }


public class _abstract {
    public static void main(String[] args) {
        B b = new B();
        b.Show();
    }
}
