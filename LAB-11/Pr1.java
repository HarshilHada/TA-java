
import java.util.Scanner;
public class Pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Element to Search:");
        int ele = sc.nextInt();
        boolean isFound = false;
        for(int i=0;i<n;i++)
        {
            if(a[i]==ele)
            {
                isFound = true;
                break;
            }
        }
        if(isFound)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
        
    }
}
