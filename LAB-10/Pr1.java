
import java.util.Scanner;


public class Pr1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter Elements of Array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Araay is:");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }  
}
