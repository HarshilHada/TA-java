import java.util.Scanner;

class Shape {
    Scanner sc = new Scanner(System.in); 
}

class Circle extends Shape {
    void area() {
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();
        double area = l * b;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    void area() {
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

public class Pr2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        c.area();
        r.area();
        t.area();
    }
}
