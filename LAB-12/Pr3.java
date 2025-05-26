
import java.util.Scanner;


public class Pr3 {
    public static void main(String[] args) {
        Bank_Account ba = new Bank_Account();
        System.out.println("Enter Bank Account Details:");
        ba.GetAccountDetails();
        System.out.println("Bank Account Details:");
        ba.DisplayAccountDetails();
        
    }    
}
class Bank_Account {
    int Account_No;
    String User_Name;
    double Account_Balance;
    String Account_Type,email;

    void GetAccountDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        Account_No = sc.nextInt();
        System.out.println("Enter Account Holder Name: ");
        User_Name = sc.next();
        System.out.println("Enter Account Balance: ");
        Account_Balance = sc.nextDouble();
        System.out.println("Enter Account Type: ");
        Account_Type = sc.next();
        System.out.println("Enter Email: ");
        email = sc.next();

    }
    void DisplayAccountDetails() {
        System.out.println("Account Number: " + Account_No);
        System.out.println("Account Holder Name: " + User_Name);
        System.out.println("Account Balance: " + Account_Balance);
        System.out.println("Account Type: " + Account_Type);
        System.out.println("Email: " + email);
    }
}
