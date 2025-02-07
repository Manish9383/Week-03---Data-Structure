package singly_linkedlist.student_record_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Record Management:");
            System.out.println("1. Add Student at Beginning");
            System.out.println("2. Add Student at End");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Update Grade");
            System.out.println("6. Display Students");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade1 = scanner.nextLine();
                    studentList.insertAtBeginning(roll1, name1, age1, grade1);
                    break;

                case 2:
                    System.out.print("Enter Roll No: ");
                    int roll2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name2 = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade2 = scanner.nextLine();
                    studentList.insertAtEnd(roll2, name2, age2, grade2);
                    break;

                case 3:
                    System.out.print("Enter Roll No to Delete: ");
                    int roll3 = scanner.nextInt();
                    studentList.deleteStudent(roll3);
                    break;

                case 4:
                    System.out.print("Enter Roll No to Search: ");
                    int roll4 = scanner.nextInt();
                    Student foundStudent = studentList.searchStudent(roll4);
                    if (foundStudent != null) {
                        foundStudent.displayStudent();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll No to Update Grade: ");
                    int roll5 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Grade: ");
                    String newGrade = scanner.nextLine();
                    studentList.updateGrade(roll5, newGrade);
                    break;

                case 6:
                    studentList.displayStudents();
                    break;

                case 7:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
