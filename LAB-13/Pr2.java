import java.util.Scanner;
public class Pr2 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Enter Student Details:");
        student.GetStudentDetails();
        student.DisplayStudentDetails();
    }
}
class Student {
    int Enrollment_No;
    String Student_Name;
    int Semester;
    double CPI, SPI;

    void GetStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Enrollment No: ");
        Enrollment_No = sc.nextInt();
        System.out.print("Enter Student Name: ");
        Student_Name = sc.nextLine();
        System.out.print("Enter Semester: ");
        Semester = sc.nextInt();
        System.out.print("Enter CPI: ");
        CPI = sc.nextDouble();
        System.out.print("Enter SPI: ");
        SPI = sc.nextDouble();
    }

    void DisplayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Enrollment No: " + Enrollment_No);
        System.out.println("Name: " + Student_Name);
        System.out.println("Semester: " + Semester);
        System.out.println("CPI: " + CPI);
        System.out.println("SPI: " + SPI);
    }

    
}
