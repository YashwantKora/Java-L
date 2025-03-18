interface Animal {
    abstract void eat();
    abstract void sleep();
}
class Dog implements Animal {
    public void eat() { 
        System.out.println("Dog is eating!");
    }
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }
}

class Cat implements Animal {
    public void eat() { 
        System.out.println("Cat is eating!");
    }
    public void sleep() {
        System.out.println("Cat is sleeping!");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}
