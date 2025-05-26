
import java.util.Scanner;


public class Pr2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array:");
    int n = sc.nextInt();
    int odd = 0, even = 0;
    int[] arr = new int[n];
    System.out.println("Enter Elements of Array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }
    System.out.println("Number of Even Elements: " + even);
    System.out.println("Number of Odd Elements: " + odd);
}
    
}
