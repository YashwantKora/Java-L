//17. Write a Java program to illustrate creating an array of objects.

public class arrayObject {
    public static void main(String[] args) {
        STUDENT[] arr = new STUDENT[5];
        arr[0] = new STUDENT(1, "Yashwant");
        arr[1] = new STUDENT(2, "Tejasai");
        arr[2] = new STUDENT(3, "Waleed");
        arr[3] = new STUDENT(4, "Hemant");
        arr[4] = new STUDENT(5, "Sathvik");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at: " + i + " " + arr[i].ROLL_NO + ' ' + arr[i].NAME);
        }
    }

}

class STUDENT {
    public int ROLL_NO;
    public String NAME;

    public STUDENT(int ROLL_NO, String NAME) {
        this.ROLL_NO = ROLL_NO;
        this.NAME = NAME;
    }
    
}

