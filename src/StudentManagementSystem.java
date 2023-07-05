import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagementSystem {

    private Student[] students;
    private int studentCount;

    public StudentManagementSystem() {

        students = new Student[100];
        studentCount = 0;

    }

    public void addStudent(){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter student name:");
            String name = scanner.nextLine();

            System.out.println("Enter roll number:");
            int rollNumber = scanner.nextInt();

            System.out.println("Enter marks in English:");
            int marksEnglish = scanner.nextInt();

            System.out.println("Enter marks in Math:");
            int marksMath = scanner.nextInt();

            System.out.println("Enter marks in Science:");
            int marksScience = scanner.nextInt();

            Student student = new Student(name, rollNumber, marksEnglish, marksMath, marksScience);
            students[studentCount] = student;
            studentCount++;
            System.out.println("Student added successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter again.");
        }

    }

    public void displayStudentInfo() {
        if (studentCount == 0) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("Student Information:");
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Total Marks: " + student.calculateTotalMarks());
            System.out.println("Grade: " + student.calculateGrade());
            System.out.println("------------------------");
        }
    }

}
