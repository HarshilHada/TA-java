import transport.Vehicle;
import showroom.Car;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println("From Main (non-subclass, outside package):");
        // System.out.println("Engine Number: " + v.engineNumber); // ❌
        // System.out.println("Model: " + v.model);               // ❌
        // System.out.println("Brand: " + v.brand);               // ❌
        System.out.println("Max Speed: " + v.maxSpeed);           // ✅

        System.out.println("\nFrom Car subclass:");
        Car c = new Car();
        c.showDetails();
    }
}
