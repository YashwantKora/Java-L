//3. Write a Java program to add a method that takes parameters.
public class addMethodParameters {
    public static void main(String[] args) {
        Box1 b = new Box1();
        b.setDim(20, 0.02, 19.2);
        b.Volume();
    }    
}
class Box1 {
    double width, height, depth;

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    void Volume() {
        System.out.println("The vloume is: " + width * height * depth);
    }
}
