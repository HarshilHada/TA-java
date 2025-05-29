

public class Pr2 {
    public static void main(String[] args) {
        System.out.println("Static Method Example:");
        Pr2.display("John Smith", 32);
    }
    static void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
      