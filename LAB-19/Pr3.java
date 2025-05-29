import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Interest i = new Interest();
        i.getDetails();        
        i.calculateInterest(); 
    }
}

class AccountDetails {
    String name;
    int accountNumber;
    double principal;
    double rate;
    int time;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        name = sc.nextLine();

        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        rate = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        time = sc.nextInt();
    }
}

// Derived class
class Interest extends AccountDetails {
    void calculateInterest() {
        double interest = (principal * rate * time) / 100;
        System.out.println("--- Account Summary ---");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Total Interest: " + interest);
    }
}


