import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    // Add new member
                    // ...
                    break;
                case 2:
                    // Process contingent and display total
                    // ...
                    break;
                case 3:
                    // Display members in arrears
                    // ...
                    break;
                case 4:
                    // Add training result or competition result
                    // ...
                    break;
                case 5:
                    // Display top 5 swimmers in each discipline
                    // ...
                    break;
                case 6:
                    // Save data to a text file
                    // ...
                    break;
                case 7:
                    // Exit the program
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("Exiting the program. Thank you!");
    }

    private void displayMenu() {
        System.out.println("===== Svømmeklubben Delfinen =====");
        System.out.println("1. Add New Member");
        System.out.println("2. Process Contingent and Display Total");
        System.out.println("3. Display Members in Arrears");
        System.out.println("4. Add Training Result or Competition Result");
        System.out.println("5. Display Top 5 Swimmers in Each Discipline");
        System.out.println("6. Save Data to a Text File");
        System.out.println("7. Exit");
    }

    private int getUserChoice() {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // consume invalid input
        }
        return scanner.nextInt();
    }
}

