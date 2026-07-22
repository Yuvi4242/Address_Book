import model.Contact;
import service.AddressBook;
import util.ConsoleHelper;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println(" Welcome To Address Book System");
        System.out.println("=====================================");
        System.out.println();

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("--- Main Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choiceInput = scanner.nextLine().trim();

            switch (choiceInput) {
                case "1":
                    System.out.println("\n--- Add Contact ---");
                    Contact newContact = ConsoleHelper.readContact(scanner);
                    addressBook.addContact(newContact);
                    System.out.println("\nContact Added Successfully.\n");
                    System.out.println(newContact);
                    System.out.println();
                    break;

                case "2":
                    System.out.println("\n--- Edit Contact ---");
                    System.out.print("Enter First Name of contact to edit: ");
                    String firstName = scanner.nextLine().trim();
                    Contact contactToEdit = addressBook.findContactByFirstName(firstName);

                    if (contactToEdit != null) {
                        ConsoleHelper.editContactDetails(contactToEdit, scanner);
                        System.out.println("\nContact Updated Successfully.\n");
                        System.out.println(contactToEdit);
                    } else {
                        System.out.println("\nContact Not Found.");
                    }
                    System.out.println();
                    break;

                case "3":
                    System.out.println("\nThank you for using Address Book System. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("\nInvalid option. Please try again.\n");
                    break;
            }
        }

        scanner.close();
    }
}
