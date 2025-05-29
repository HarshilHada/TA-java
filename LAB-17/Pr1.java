import java.util.Scanner;
public class Pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculateArea c= new CalculateArea();
        System.out.println("Enter length and breadth of rectangle:");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        c.area(length, breadth);
        System.out.println("Enter radius of circle:");
        int radius = sc.nextInt();
        c.area(radius);
        System.out.println("Enter base and height of triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        c.area(base, height);
        
    }
}
class CalculateArea{
    void area(int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
    void area(int radius) {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
    void area(double base, double height) {
        System.out.println("Area of triangle: " + (0.5 * base * height));
    }
}
