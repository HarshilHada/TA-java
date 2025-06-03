package exam;

import student.Student;

public class Result extends Student {
    private int[] marks = new int[3];

    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    public int totalMarks() {
        return marks[0] + marks[1] + marks[2];
    }

    public float averageMarks() {
        return totalMarks() / 3.0f;
    }

    public void displayMarkSheet() {
        System.out.println("----- Mark Sheet -----");
        System.out.println("Name   : " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks  : " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Total  : " + totalMarks());
        System.out.println("Average: " + averageMarks());
        System.out.println("----------------------");
    }
}
