public class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student(1, "Alice");
        arr[1] = new Student(2, "Bob");
        arr[2] = new Student(3, "Charlie");
        arr[3] = new Student(4, "David");
        arr[4] = new Student(5, "Eve");
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element at " + i + " : " + arr[i].RollNo + " " + arr[i].Name);
        }
    }

}
class Student{
    public int RollNo;
    public String Name;

    public Student(int RollNo, String Name) {
        this.RollNo = RollNo;
        this.Name = Name;
    }
}
