class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
    }
}

class Employee extends Member {
    String specialization;

    void printEmployeeDetails() {
        printDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    String department;

    void printManagerDetails() {
        printDetails();
        System.out.println("Department: " + department);
    }
}

public class Pr4 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Rahul Mehta";
        emp.age = 18;
        emp.phoneNumber = "9876543210";
        emp.address = "Ahmedabad, Gujarat";
        emp.salary = 45000.0;
        emp.specialization = "Web Development";

        Manager mgr = new Manager();
        mgr.name = "John Mitchell";
        mgr.age = 35;
        mgr.phoneNumber = "9123456780";
        mgr.address = "Mumbai, Maharashtra";
        mgr.salary = 75000.0;
        mgr.department = "HR";

        System.out.println("Employee Details");
        emp.printEmployeeDetails();

        System.out.println("\nManager Details");
        mgr.printManagerDetails();
    }
}