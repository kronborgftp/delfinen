import clubmanagement.*;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    Controller controller = new Controller();

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
                    Person newMember = createNewMember();
                    Membership newMembership = new Membership(newMember, LocalDate.now());
                    // Add newMembership to your data structure (e.g., a list or map)
                    System.out.println("New member added successfully!");
                    break;

                case 2:
                    // Process contingent and display total
                    Person member = createNewMember(); // Assume you get a member for whom you want to process the contingent
                    Membership membership = new Membership(member, LocalDate.now());
                    Contingent contingent = new Contingent(membership);

                    // Add contingent to your data structure (e.g., a list or map) if needed
                    // ...

                    System.out.println("Contingent processed successfully. Total amount: " + contingent.getAmount());
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

    private Person createNewMember() {
        System.out.print("Enter member name: ");
        String name = scanner.next();

        System.out.print("Enter member age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid age.");
            scanner.next(); // consume invalid input
        }
        int age = scanner.nextInt();

        // Additional prompts for activity type, member type, etc.
        // ...

        return new Person(name, age, ActivityType.ACTIVE, MemberType.SENIOR);
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