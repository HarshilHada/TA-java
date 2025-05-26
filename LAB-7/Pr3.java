
import java.util.Scanner;



public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact=0;
        for (int i = n; i <=1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial is : "+fact);
    }
}
