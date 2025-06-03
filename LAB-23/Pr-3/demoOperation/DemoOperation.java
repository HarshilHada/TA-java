package demoOperation;

import calculator.MathOperation;

public class DemoOperation {
    public static void main(String[] args) {
        MathOperation op = new MathOperation();

        int a = 20;
        int b = 10;

        System.out.println("Addition: " + op.addition(a, b));
        System.out.println("Subtraction: " + op.subtraction(a, b));
        System.out.println("Multiplication: " + op.multiplication(a, b));
        System.out.println("Division: " + op.division(a, b));
    }
}
