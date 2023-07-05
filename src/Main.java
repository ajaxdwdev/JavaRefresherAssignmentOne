import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentMngmntSys = new StudentManagementSystem();

        int menuOption;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student Information");
            System.out.println("3. Exit");
            System.out.println("Enter your choice number:");

            try {

                menuOption = scanner.nextInt();
                scanner.nextLine();

                switch (menuOption) {
                    case 1:
                        studentMngmntSys.addStudent();
                        break;
                    case 2:
                        studentMngmntSys.displayStudentInfo();
                        break;
                    case 3:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid number (1-3).");
                scanner.nextLine();
                menuOption = 0;
            }
        } while (menuOption != 3);

    }

}
