import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        if (str.equals(sb.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
