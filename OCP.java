interface Shape {
    public double CalculateArea();
}
class Rectangle implements Shape {
    double w, l;
    public double CalculateArea() {
        return l * w;
    }
}
class Circle implements Shape {
    double r;
    public double CalculateArea() {
        return 3.14 * r * r;
    }
}
class AreaCal {
    public double CalculateShapeArea(Shape shape) {
        return shape.CalculateArea();
    }
}

public class OCP {
    public static void main(String[] args) {
        AreaCal a = new AreaCal();
        Rectangle r = new Rectangle();
        r.l = 10;
        r.w = 20;
        Circle c = new Circle();
        c.r = 10.5;
        System.out.println(a.CalculateShapeArea(r));
        System.out.println(a.CalculateShapeArea(c));
    }
}
