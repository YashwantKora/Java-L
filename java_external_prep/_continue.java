//14. Write a Java program to demonstrate break & continue statement.

public class _continue {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) { 
            if (i == 4)
                continue;
            System.out.println(i);
        }
    }
}
