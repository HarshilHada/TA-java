import java.util.Scanner;
public class Pr3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("Enter Radius of Circle:");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + c.area(radius));
        System.out.println("Perimeter of Circle: " + c.perimeter(radius));
    } 
}

class Circle {
    double area(double r) {
        return 3.14 *(r * r);
    }

    double perimeter(double r) {
        return 2 * 3.14 * r;
    }   
}

