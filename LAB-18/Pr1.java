

public class Pr1 {
    public static void main(String[] args) {
        Student student = new Student("Mitchell Smith", 22);
        System.out.println("Student Details:");
        student.display();
    }
    
}

class Student{
    String name;
    int age;
    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
