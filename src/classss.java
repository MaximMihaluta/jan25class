import java.util.Scanner;

public class classss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a text :");
        String usertext = sc.nextLine();
        int numberOfChars = usertext.length();
        System.out.println("The number of chars: " + numberOfChars);


    }
}
