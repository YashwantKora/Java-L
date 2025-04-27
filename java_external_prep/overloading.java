//23. Write a Java program to demonstrate method overloading.

class _method{
    void method(){
        System.out.println("No Parameters");
    }
    void method(int a, int b){
        System.out.println("a + b = " + (a + b));
    }
}

public class overloading {
    public static void main(String[] args) {
        _method ob = new _method();
        ob.method();
        ob.method(1,2);
    }
}
