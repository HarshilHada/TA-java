
import java.util.Scanner;

public class Pr2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    Pr2 obj = new Pr2();
    obj.getMax(a, b, c);
   }
   void getMax(int a, int b, int c) {
       if (a > b && a > c) {
           System.out.println("Maximum number is: " + a);
       } else if (b > a && b > c) {
           System.out.println("Maximum number is: " + b);
       } else {
           System.out.println("Maximum number is: " + c);
       }
   }
}
