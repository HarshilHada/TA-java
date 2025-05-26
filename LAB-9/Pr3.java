import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get Factorial:");
        int n = sc.nextInt();
        Pr3 obj = new Pr3();
        long ans = obj.getFactorial(n);
        System.out.println("Factorial of " + n + " is: " + ans);
     }

    long getFactorial(int n) {
        if (n < 0) return -1; 
        if (n == 0 || n == 1) return 1; 
        return n * getFactorial(n - 1); 
    }
}