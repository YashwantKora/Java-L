//16. Write a Java program to demonstrate string class and its methods.

public class _string {
    public static void main(String[] args) {
        System.out.println("__StringDemo__");
        String s1 = new String("sjpcs");
        String s2 = "sjpcs";
        String s3 = "";
        System.out.println("The string s1 = " + s1);
        System.out.println("The string s2 = " + s2);
        System.out.println("charAt = " + s2.charAt(2));//returns the character at specified index value
        System.out.println("The length of s1 = " + s1.length());//returns the length of a string
        System.out.println("substring begin index = " + s1.substring(1));//similar to slicing in python
        System.out.println("substring begin & end index = " + s2.substring(1,3));// ^_^
        System.out.println("s1 equals to s2 is = " + s1.equals(s2));//returns true if the strings are same, else false
        System.out.println("check is empty = " + s3.isEmpty());//returns true is the string is empty
        System.out.println("The lenght of string = " + s2.length());//length again :3
        System.out.println("replace = " + s1.replace("s", "a"));//replaces the given character 1. the character to be replaced as, 2. The character to be replaced
        System.out.println("Lower case = " + s1.toLowerCase());//self explanatory 
        System.out.println("Upper case = " + s1.toUpperCase());// duh :<
        System.out.println("s1 equals ignore case s2 = " + s1.equalsIgnoreCase(s2));//same as equals but blind lol

    }
}
