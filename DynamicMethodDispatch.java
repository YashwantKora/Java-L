class A {
    void Display() { 
        System.out.println("Inside Class A!");
    }
}
class B extends A {
    void Display() {
        System.out.println("Inside Class B!");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a = new A();
        a.Display();
        B b = new B();
        b.Display();
        a = b;
        a.Display();
    }
}
