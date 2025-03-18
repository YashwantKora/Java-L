abstract class A {
    abstract void Show();
}
class B extends A {
    void Show() {
        System.out.println("Inside the Subclass!");
    }
}
public class Abstract {
    public static void main(String[] args) {
        B b = new B();
        b.Show();
    }
}
