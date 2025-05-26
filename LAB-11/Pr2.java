import java.util.Scanner;
public class Pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Elements of Array (Enter in sorted order):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Element to Search:");
        int ele = sc.nextInt();
        int low = 0;
        int high = n - 1;
        boolean isFound = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == ele) {
                isFound = true;
                break;
            } else if (a[mid] < ele) {
                low = mid + 1;
            } else if (a[mid] > ele) {
                high = mid - 1;
            }
        }
        if (isFound) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }    
}
