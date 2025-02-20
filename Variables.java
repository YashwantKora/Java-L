import org.w3c.dom.ls.LSOutput;

public class Variables {
    public static void main(String[] args){
        int age = 18;
        int year = 2025;
        double liters = 2.5;
        char grade = 'A';
        boolean passed = true;

        System.out.println(age);
        System.out.println(year);
        System.out.println(liters + "L" );
        System.out.println("Your grade: " + grade);
        System.out.println("You passed: " + passed);
    }

}
//variable
/*
primitive = simple values that are stored directly in memory(stack)
    int
    double
    char
    boolean
reference = memory address(stack) that points to the (heap)
    string
    array
    object
 */