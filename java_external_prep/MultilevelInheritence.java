//32. Write a Java program to demonstrate multilevel inheritance.

class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void bark(){
        System.out.println(name + " is barking");
    }
}

class Puppy extends Dog{
    public Puppy(String name){
        super(name);
    }
    public void weep(){
        System.out.println(name + " is weeping");
    }
}

public class MultilevelInheritence {
    public static void main(String[] args) {
        Dog dog = new Dog("Snowy");
        dog.eat();
        dog.sleep();
        dog.bark();
        Puppy puppy = new Puppy("Snowball");
        puppy.eat();
        puppy.sleep();
        puppy.weep();
    }   
}
