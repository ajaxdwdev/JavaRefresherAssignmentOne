import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentMngmntSys = new StudentManagementSystem();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student Information");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentMngmntSys.addStudent();
                    break;
                case 2:
                    studentMngmntSys.displayStudentInfo();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

    }

}
