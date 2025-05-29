final class Bank {
    final int employee = 8;

    final void printInterestRate() {
        System.out.println("Employee in bank is: " + employee);
    }
}

class Base {
    final int constantValue = 100;

    final void showMessage() {
        System.out.println("This is a final method from Base class");
    }
}

class Derived extends Base {
    void displayValue() {
        System.out.println("Final variable value: " + constantValue);
    }
}

public class Pr3 {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.printInterestRate();

        Derived d = new Derived();
        d.displayValue();
        d.showMessage();
    }
}
