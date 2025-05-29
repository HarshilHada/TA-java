public class Pr4 {
    static int number = 10;
    static {
        System.out.println("Static block executed");
        System.out.println("Accessing static variable in static block: number = " + number);
    }

    
    static void showNumber() {
        System.out.println("Accessing static variable in static method: number = " + number);
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        showNumber();
    }
}
