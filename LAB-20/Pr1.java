public class Pr1 {
    public static void main(String[] args) {
        Vegetable v1 = new Vegetable();
        v1.eat();  
        tomato b1 = new tomato();
        b1.eat();  
        Vegetable v2 = new Vegetable();
        v2.eat();  
    }
}
class Vegetable {
    void eat() {
        System.out.println("This is Vegetable");
    }
}

class tomato extends Vegetable {
    @Override
    void eat() {
        System.out.println("tomato is Vegetable");
    }
}


