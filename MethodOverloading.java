

class Meth{
    void method(){
        System.out.println("No Parameters");
    }
    void method(int a, int b){
        System.out.println("a + b = " + (a + b));
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Meth ob = new Meth();
        ob.method();
        ob.method(1,2);
    }
}
