import java.util.Scanner;
public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of Array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
    }
}
