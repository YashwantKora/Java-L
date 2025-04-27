//4. Write a Java program to demonstrate this keyword.
public class _this {
    public static void main(String[] args) {
        Box2 b = new Box2(10, 20, 20.6);
        b.Volume();
    }
}
class Box2 {
    double width, height, depth;

    Box2(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    void Volume() {
        System.out.println("The volume is: " + this.width * this.height * this.depth);
    }
}
