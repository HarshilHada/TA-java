import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Using For Loop");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Using while Loop");
        int sum1 = 0;
        int i = 1;
        while (i <= n) {
            sum1 += i;
            i++;
        }
        System.out.println("Sum = " + sum1);
        
    }
}
