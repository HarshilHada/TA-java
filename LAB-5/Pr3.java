import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (like 5.75): ");
        double num = sc.nextDouble();
        // int to double
        int small = 7;
        double big = small;
        System.out.println("int " + small + " to double: " + big);

        //  double to int
        int narrowsmall = (int) num;
        System.out.println("double " + num + " to int: " + narrowsmall);
    }
}