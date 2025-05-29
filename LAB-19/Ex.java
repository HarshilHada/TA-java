// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

// Single Inheritance: Car inherits from Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Multilevel Inheritance: ElectricCar inherits from Car
class ElectricCar extends Car {
    void charge() {
        System.out.println("ElectrcCar is charging");
    }
}

// Hierarchical Inheritance: Bike also inherits from Vehicle
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
}

// Main class to demonstrate
public class Ex {
      public static void main(String[] args) {
        // Single Inheritance
        System.out.println("Single Inheritance:");
        Car car = new Car();
        car.start();
        car.drive();

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance:");
        ElectricCar eCar = new ElectricCar();
        eCar.start();
        eCar.drive();
        eCar.charge();

        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");
        Bike bike = new Bike();
        bike.start();
        bike.ride();
    }
}
