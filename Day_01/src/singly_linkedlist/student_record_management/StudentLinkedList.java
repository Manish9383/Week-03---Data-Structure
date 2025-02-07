package singly_linkedlist.student_record_management;

public class StudentLinkedList {
    private Student head;


    public void insertAtBeginning(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    public void insertAtEnd(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    public void deleteStudent(int rollNo) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student with Roll No " + rollNo + " not found.");
        } else {
            temp.next = temp.next.next;
        }
    }

    public Student searchStudent(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void updateGrade(int rollNo, String newGrade) {
        Student student = searchStudent(rollNo);
        if (student != null) {
            student.grade = newGrade;
            System.out.println("Grade updated for Roll No " + rollNo);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayStudents() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }
        Student temp = head;
        while (temp != null) {
            temp.displayStudent();
            temp = temp.next;
        }
    }
}
