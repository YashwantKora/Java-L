//10. Write a Java program to demonstrate switch statement.

import java.util.Scanner;

public class _switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What semester are you studying in? ");
        int year = scanner.nextInt();

        switch (year) {
            case 1:
            System.out.println("Your subjects: Maths, IT Skills, SA, FOC");
            break;
            case 2:
            System.out.println("Your subjects: PMS, CAD, MM");
            break;
            case 3:
            System.out.println("Your subjects: Python, CN, CH, DBMS");
            break;
            case 4:
            System.out.println("Your subjects: DSA, Java, OS, SE");
            break;
            case 5:
            System.out.println("Your subjects: AIML");
            break;
            case 6:
            System.out.println("Your subjects: intership/project");
            break;
            default:
            System.out.println("PLEASE ENTER THE NUMBERS 1-6 ONLY!!");
        }
    }    
}
