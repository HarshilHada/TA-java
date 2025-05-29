
interface Engine {
    void startEngine();
}


interface Wheels {
    void rotateWheels();
}


class Car implements Engine, Wheels {
    
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    
    public void rotateWheels() {
        System.out.println("Car wheels are rotating now.");
    }
}


public class Pr1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.rotateWheels();
    }
}
