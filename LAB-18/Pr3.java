public class Pr3 {

    
    static {
        System.out.println("Static block is executed before main()");
    }

    static void sayHello() {
        System.out.println("Hello from static method");
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        sayHello(); // Calling static method
    }
}
