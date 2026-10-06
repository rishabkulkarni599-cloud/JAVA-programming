import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.next();

                    System.out.print("Enter your age: ");
                    int age = sc.nextInt();

                    System.out.print("Do you want to continue? (y/n): ");
                    char ch = sc.next().charAt(0);

                    if (ch == 'y' || ch == 'Y') {
                        System.out.println("Continuing...");
                    } else {
                        System.out.println("Thank you!");
                    }
                    break;

                case 2:
                    System.out.println("Display selected");
                    break;

                case 3:
                    System.out.println("Raise Salary selected");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
