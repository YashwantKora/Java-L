//24. Write a Java program to demonstrate method overriding.

class Animal{
    public void makeSound(){
        System.out.println("Animal is making sounds");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog is making sounds");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat is making sounds");
    }
}

public class overriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
