

public class buffer {
    public static void main(String[] args) {
        System.out.println("__StringDemo__");
        StringBuffer str = new StringBuffer("Object Language");
        System.out.println("Orignal string = " + str);
        System.out.println("Length = " + str.length());
        System.out.println("Capacity = " + str.capacity());
        int pos = str.indexOf("Language");
        str.insert(pos, "Oriented");
        System.out.println("Modified string = " + str);
        str.setCharAt(6, '-');
        System.out.println("String now = " + str);
        str.append("improve security");
        System.out.println("Appended string = " + str);
        System.out.println("Length = " + str.length());
    }
}
