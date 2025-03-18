

public class strmethods {
    public static void main(String[] args) {
        System.out.println("__StringDemo__");
        String s1 = new String("sjpcs");
        String s2 = "sjpcs";
        String s3 = "";
        System.out.println("The string s1 = " + s1);
        System.out.println("The string s2 = " + s2);
        System.out.println("charAt = " + s2.charAt(2));
        System.out.println("The length of s1 = " + s1.length());
        System.out.println("substring begin index = " + s1.substring(1));
        System.out.println("substring begin & end index = " + s2.substring(1,3));
        System.out.println("s1 equals to s2 is = " + s1.equals(s2));
        System.out.println("check is empty = " + s3.isEmpty());
        System.out.println("The lenght of string = " + s2.length());
        System.out.println("replace = " + s1.replace("s", "a"));
        System.out.println("Lower case = " + s1.toLowerCase());
        System.out.println("Upper case = " + s1.toUpperCase());
        System.out.println("s1 equals ignore case s2 = " + s1.equalsIgnoreCase(s2));

    }
}
