import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
        System.out.println("Bitwise NOT (first number): " + (~num1));
        System.out.println("Left Shift (first number by 1): " + (num1 << 1));
        System.out.println("Right Shift (first number by 1): " + (num1 >> 1));
    }
}