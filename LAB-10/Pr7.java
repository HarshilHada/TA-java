import java.util.Scanner;

public class Pr7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array:");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter Elements of Array:");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Array is:");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
    int large = a[0];
    int small = a[0];
    int secondLarge = a[0];
    int secondSmall = a[0];
    for (int i = 1; i < n; i++) {
            if (a[i] > large) {
                secondLarge = large;
                large = a[i];
            } else if (a[i] < large && a[i] > secondLarge) {
                secondLarge = a[i];
            }
            if (a[i] < small) {
                secondSmall = small;
                small = a[i];
            } else if (a[i] > small && a[i] < secondSmall) {
                secondSmall = a[i];
            }
        }
    System.out.println("Second Largest Element: " + secondLarge);
    System.out.println("Second Smallest Element: " + secondSmall);

  }  
}
