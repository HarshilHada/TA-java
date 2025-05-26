
import java.util.Scanner;


public class Pr4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n for Fibonacci series:");
    int n = sc.nextInt();
    Pr4 obj = new Pr4();
    obj.getFibonacci(n);
   }
   void getFibonacci(int n)
   {
        int a=0,b=1;
        System.out.println("Fibonacci Series:");
        System.out.println(a);
        System.out.println(b);
        for(int i = 0;i<n;i++)
        {
            int c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
   } 
}
