
import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hight in meters:");
        double h = sc.nextDouble();
        double feet = h * 3.28084;
        System.out.println("Height in feet is: " + feet);
    }
}
