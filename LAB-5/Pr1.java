import java.util.Scanner;

class Pr1 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String result = (num > 0)? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result);
    }    
}
