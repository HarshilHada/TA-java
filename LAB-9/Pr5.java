
import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int n = sc.nextInt();
        Pr5 p = new Pr5();
        int ans = p.getPrime(n);
        if(ans==1)
        {
            System.out.println("prime number");
        }
        else
        {
            System.out.println("not a prime number");
        }
    }
    int getPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }    
}
