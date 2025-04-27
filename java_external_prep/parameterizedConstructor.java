//8. Write a Java program to demonstrate parameterized constructor.

public class parameterizedConstructor {
    public static void main(String[] args) {
        Box4 b = new Box4(10, 20, 30);
        b.Volume();
    }    
}
class Box4 {
    double width, height, depth;
    Box4(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    void Volume() {
        System.out.println("Volume is: " + width * height * depth);
    }
}
