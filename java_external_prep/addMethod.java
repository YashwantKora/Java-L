
public class addMethod {
    public static void main(String [] args) {
        Box b = new Box();
        b.width = 10.5;
        b.height = 15.7;
        b.depth = 5.5;
        b.Volume();
    }
}
class Box {
    double width, height, depth;

    void Volume() {
        System.out.println("Volume is: " + width * height * depth);
    }
}
