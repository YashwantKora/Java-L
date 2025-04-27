//21. Write a Java program to demonstrate multiple catch block in exception handling.

public class multipleCatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[1];
            a[0] = 30 / 0;
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occured");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occured");
        }catch (Exception e) {
            System.out.println("Parent exception occured");
        }
        finally {
            System.out.println("This block always executes (finally block)");
        }
    }
}
