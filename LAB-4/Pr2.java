
import java.util.Scanner;

class Pr2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter temperature in fahrenheit: ");
    double fahrenheit = sc.nextDouble();
    double celsius = (fahrenheit - 32) * 5 / 9;
    System.out.println("Temperature in celsius is: " + celsius);

    }   
}
