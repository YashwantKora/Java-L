//22. Write a Java program to demonstrate throwing our own exceptions.

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}


public class ownException {
    
    public static void main(String[] args) {
        try {
            int number = -5;
            if (number < 0) {
                throw new MyException("Negative numbers are not allowed!");
            }
            System.out.println("The number is valid.");
        } 
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

}
