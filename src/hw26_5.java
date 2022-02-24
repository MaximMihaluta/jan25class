/*5. Write a Java program to test if a given string contains the specified sequence of char values.
        Sample Output:
        Original String: PHP Exercises and Python Exercises
        Specified sequence of char values: and
        true

        Another Sample Output:
        Original String: PHP Exercises and Python Exercises
        Specified sequence of char values: Java
        false*/

public class hw26_5 {
    public static void main(String[] args) {

        String s1 = "PHP Exercises and Python Exercises";
        String s2= "and";
        String s3 = "Java";

        System.out.println("Sample Output:");
        System.out.println("Original String: " + s1);
        System.out.println("Specified sequence of char values: " + s2);
        System.out.println(s1.contains(s2));

        System.out.println("  ");

        System.out.println("Another Sample Output:");
        System.out.println("Original String: " + s1);
        System.out.println("Specified sequence of char values: " + s3);
        System.out.println(s1.contains(s3));


    }
}
