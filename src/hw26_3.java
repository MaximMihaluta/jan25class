
/*
3. Write a Java program to compare two strings lexicographically, ignoring case differences.
        Sample Output:
        String 1: This is exercise 1
        String 2: This is Exercise 1
        "This is exercise 1" is equal to "This is Exercise 1"

*/
public class hw26_3 {
    public static void main(String[] args) {

        String s1 = "This is exercise 1";
        String s2 = "This is Exercise 1";

        System.out.println("Sample Output: ");
        System.out.println("String 1: " + s1);
        System.out.println("String2: " + s2);
        System.out.println("\"This is exercise 1\" is equal to \"This is Exercise 1\"");
        System.out.println(s1.compareToIgnoreCase(s2));


        System.out.println(" practice in class _________________");
        System.out.println("------------------------------------");
    }
}
