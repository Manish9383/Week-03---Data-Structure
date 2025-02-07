package singly_linkedlist.student_record_management;

public class Student {
    int rollNo;
    String name;
    int age;
    String grade;
    Student next; // Pointer to next student node

    public Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}
