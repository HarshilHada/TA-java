
abstract class Shape {
    abstract void area();  
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
public class Pr1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(25.0, 3.0);
        Circle circ = new Circle(3.0);

        rect.area();  
        circ.area();  
    }
}


