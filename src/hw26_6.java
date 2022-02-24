/*6. Write a Java program to check whether two String objects contain the same data.
        Sample Output:
        "Stephen Edwin King" equals "Walter Winchell"?   false
        "Stephen Edwin King" equals "Mike Royko"?    false
        "Stephen Edwin King" equals "Stephen Edwin King"?   true*/

import javax.xml.transform.Source;

public class hw26_6 {
    public static void main(String[] args) {

        String s1 = "Stephen edwin King";
        String s2 = "Walter Winchell";
        String s3 = "Mike Royko";

        System.out.println("Sample Output");
        System.out.println("\"Stephen Edwin KIng\" equals \"Walter Winchell\"?");
        System.out.println(s1.equals(s2));
        System.out.println("\"Stephen Edwin Kind\" equals \"Mike Royko\"?");
        System.out.println(s1.equals(s3));
        System.out.println("\"Stephen Edwin King\" equals \"Stephen Edwin King\"?");
        System.out.println(s1.equals(s1));




    }
}
