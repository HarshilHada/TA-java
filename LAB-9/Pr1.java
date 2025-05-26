
import java.util.Scanner;


public class Pr1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Principal Amount, Rate of Interest , Time :");
    double p = sc.nextDouble();
    double r = sc.nextDouble();
    double n = sc.nextDouble();
    Pr1 obj = new Pr1();
    obj.calculateSimpleInterest(p, r, n);
   }
   void calculateSimpleInterest(double p, double r, double n) {
       double si = (p * r * n) / 100;
       System.out.println("Simple Intrest is : " + si);
   }
 
}
