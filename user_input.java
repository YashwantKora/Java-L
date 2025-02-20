import java.util.Scanner;

public class user_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name);
        System.out.println("You are: " + age + " Years old!");
        scanner.close();
    }

}
//user input
/*
nextLine() - reads the entire line including whitespace
next() = stops reading when it encounters a whitespace
 */