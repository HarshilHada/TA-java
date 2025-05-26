import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();

        double weightKg = weight * 0.45359237;
        double heightMeters = height * 0.0254;

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("Your BMI is: "+bmi);

        input.close();
    }
}