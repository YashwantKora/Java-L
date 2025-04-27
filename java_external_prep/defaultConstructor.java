//7. Write a Java program to demonstrate default constructor.

public class defaultConstructor {
    public static void main(String[] args) {
        Box3 b = new Box3();
        b.Volume();
    }
}
class Box3 {
    double width, height, depth;

    Box3() {
        System.out.println("Constructing box");
        width = 10.5;
        height = 10.5;
        depth = 21.0;
    }

    void Volume() {
        System.out.println("Volume is: " + width * height * depth);
    }

       
}
