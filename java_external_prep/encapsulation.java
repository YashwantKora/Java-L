//15. Write a Java program to demonstrate encapsulation concept.

public class encapsulation {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.setName("Yashwant");
        emp.setAge(18);
        emp.setSalary(100000000);

        System.out.println("Employee name: " + emp.getName());
        System.out.println("Employee age: " + emp.getAge());
        System.out.println("Employee salary: " + emp.getSalary());
    }
}
