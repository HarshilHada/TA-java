import java.util.Scanner;

public class Pr1 {
   public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Enter Employee Details:");
        emp.GetEmployeeDetails();
        emp.DisplayEmployeeDetails();
    } 
}

class Employee {
    int Employee_ID;
    String Employee_Name,Designation;
    int Age;
    double Salary;

    void GetEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        Employee_ID = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        Employee_Name = sc.nextLine();
        System.out.print("Enter Designation: ");
        Designation = sc.nextLine();
        System.out.print("Enter Age: ");
        Age = sc.nextInt();
        System.out.print("Enter Salary: ");
        Salary = sc.nextDouble();
    }

    void DisplayEmployeeDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + Employee_ID);
        System.out.println("Name: " + Employee_Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Age: " + Age);
        System.out.println("Salary: " + Salary);
    }

    
}


