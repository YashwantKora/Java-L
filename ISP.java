

interface Toy {
    void price(double p);
    void colour(String c);
}

interface move{
    void move();
}
interface fly{
    void fly();
}

class Car implements Toy, move {
    double p;
    String c;
    public void price(double p){
        this.p = p;
        System.out.println("PRICE IS" + p);
    }
    public void colour(String c) {
        this.c = c;
        System.out.println("COLOUR IS " + c);
    }
    public void move(){
        System.out.println("The Car is moving!");
    }
}
class Aeroplane implements Toy, fly {
    double p;
    String c;
    public void price(double p){
        this.p = p;
    }
    public void colour(String c) {
        this.c = c;
    }
    public void fly(){
        System.out.println("The areoplane is flying!");
    }
}
public class ISP {
    public static void main(String[] args) {
        Car c = new Car();
        c.price(1000);
        c.colour("black");
        c.move();
        Aeroplane a = new Aeroplane();
        a.price(1000000000);
        a.colour("red");
        a.fly();
    }
}
