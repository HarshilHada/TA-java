import java.util.Scanner;

class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:(from +,-,*,/,%)");
        char choice = sc.next().charAt(0);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (choice) {
            case '+':
                System.out.println("Addition is: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction is: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication is: " + (a * b));
                break;
            case '/':
                System.out.println("Division is: " + (a / b));
                break;
            case '%':
                System.out.println("Remainder is: " + (a % b));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
