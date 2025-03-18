class Student { 
    public int roll_no;
    public String name;
    
    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}
class Program25 {
    public static void main(String[] args) {
        Student[] arr = new Student[5];

        arr[0] = new Student(1, "aaa");
        arr[1] = new Student(2, "bbb");
        arr[2] = new Student(3, "ccc");
        arr[3] = new Student(4, "ddd");
        arr[4] = new Student(5, "eee");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : Roll No = " + arr[i].roll_no + ", " + arr[i].name);
        }
    }
}
