//30. Write a Java program to demonstrate enum in java.

public class E_num {
    enum Day {
        sunday, monday, tuesday, wednesday, thursday, friday, saturday
    }

    public static void main(String[] args) {
        for (Day d : Day.values()) {
            Weekend(d);
        }
    }

    static void Weekend(Day d) {
        if (d.equals(Day.sunday)) {
            System.out.println(d + " is a holiday");
        } else {
            System.out.println(d + " is a working day");
        }
    }
}
