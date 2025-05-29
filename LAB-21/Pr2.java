
abstract class Vegetable {
    String color;

    Vegetable(String color) {
        this.color = color;
    }

    public abstract String toString();
}

class Potato extends Vegetable {
    Potato(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Potato - Color: " + color;
    }
}

class Brinjal extends Vegetable {
    Brinjal(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Brinjal - Color: " + color;
    }
}

class Tomato extends Vegetable {
    Tomato(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Tomato - Color: " + color;
    }
}

public class Pr2 {
    public static void main(String[] args) {
        Potato potato = new Potato("Brown");
        Brinjal brinjal = new Brinjal("Purple");
        Tomato tomato = new Tomato("Red");

        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}

