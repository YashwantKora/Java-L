//9. Write a Java program to demonstrate if else-if statement.

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter #1: ");
        double a = scanner.nextDouble();

        System.out.println("Enter #2: ");
        double b = scanner.nextDouble();

        if (a == b) {
            System.out.println("#1 is equal to #2");
        }
        else if (a > b) {
            System.out.println("#1 is  greater than #2");
        }
        else if (b > a) {
            System.out.println("#2 is greater than #1");
        }
        else {
            System.out.println("Invalid inputs!");
        }
        scanner.close();
    }
}
