
class Animal {
    String name = "Dog";

    Animal() {
        System.out.println("Animal class constructor called");
    }

    void displayInfo() {
        System.out.println("This is the Animal class method.");
    }
}

class Dog extends Animal {
    String name = "Golden Retriever";

    Dog() {
        super();
        System.out.println("Parent class constructor called");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("This is the Child class method.");
    }

    void showNames() {
        System.out.println("Dog name : " + name);
        System.out.println("Animal name : " + super.name);
    }
}

public class Pr2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println();
        d.displayInfo();
        System.out.println();
        d.showNames();
    }
}
