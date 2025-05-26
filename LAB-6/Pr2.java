import java.util.Scanner;
public class Pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 subject marks:");
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        double average = total / 5.0;
        if (average > 35) {
            System.out.println("Fail");
        } else if (average >= 35 && average <= 45) {
            System.out.println("Pass Class");
        } else if (average >= 45 && average <= 60) {
            System.out.println("Second class");
        } else if (average >= 60 && average <= 70) {
            System.out.println("First class");
        } else if (average > 70) {
            System.out.println("Distinction");
        }
    }
}
