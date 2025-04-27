//13. Write a Java program to demonstrate do-while statement.

import java.util.Scanner;

public class _doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "yashwant";
        String input_username;

        do { 
            System.out.println("Enter your username: ");
            input_username = scanner.nextLine();
        } while (!username.equals(input_username));

        System.out.println("Correct username entered!");
        scanner.close();
    }
}
