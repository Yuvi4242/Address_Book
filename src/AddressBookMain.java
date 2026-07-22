import model.Contact;
<<<<<<<<< Temporary merge branch 1
=========
import service.AddressBook;
import util.ConsoleHelper;

import java.util.List;
import java.util.Scanner;
>>>>>>>>> Temporary merge branch 2

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println(" Welcome To Address Book System");
        System.out.println("=====================================");
        System.out.println();

<<<<<<<<< Temporary merge branch 1
        Contact contact = new Contact(
            "John",
            "Doe",
            "123 Main St",
            "Springfield",
            "Illinois",
            "62701",
            "555-123-4567",
            "john.doe@example.com"
        );

        System.out.println(contact);
=========
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=========================");
            System.out.println("ADDRESS BOOK SYSTEM");
            System.out.println("=========================");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    addContact(addressBook, scanner);
                    break;
                case "2":
                    editContact(addressBook, scanner);
                    break;
                case "3":
                    deleteContact(addressBook, scanner);
                    break;
                case "4":
                    displayContacts(addressBook);
                    break;
                case "5":
                    System.out.println("\nThank you for using Address Book System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid option. Please try again.\n");
                    break;
            }
        }
    }

    private static void addContact(AddressBook addressBook, Scanner scanner) {
        System.out.println("\n--- Add Contact ---");
        Contact contact = ConsoleHelper.readContact(scanner);
        addressBook.addContact(contact);
        System.out.println("\nContact Added Successfully.\n");
        System.out.println(contact);

        scanner.close();
>>>>>>>>> Temporary merge branch 2
    }
}
