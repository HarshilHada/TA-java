package showroom;

import transport.Vehicle;

public class Car extends Vehicle {
    public void showDetails() {
        // System.out.println("Engine Number: " + engineNumber); // ❌ private
        // System.out.println("Model: " + model);               // ❌ default
        System.out.println("Brand: " + brand);                 // ✅ protected
        System.out.println("Max Speed: " + maxSpeed);          // ✅ public
    }
}
