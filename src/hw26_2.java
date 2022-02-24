
/*
2. Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
        Sample Output:
        String 1: This is Exercise 1
        String 2: This is Exercise 2
        "This is Exercise 1" is less than "This is Exercise 2"
*/
public class hw26_2 {
    public static void main(String[] args) {
String s1 = "This is Exercise 1";
String s2 = "This is Exercise 2";

        System.out.println("Sample Output:");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("\"This Exercise 1\" is less than \"This Exercise 2\"");
        System.out.println(s1.compareTo(s2));







    }
}
