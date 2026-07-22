import model.Contact;
import service.AddressBook;
import util.ConsoleHelper;

import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
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
        System.out.println();
    }

    private static void editContact(AddressBook addressBook, Scanner scanner) {
        System.out.println("\n--- Edit Contact ---");
        System.out.print("Enter First Name of contact to edit: ");
        String name = scanner.nextLine().trim();
        Contact contact = addressBook.findContactByFirstName(name);

        if (contact != null) {
            ConsoleHelper.editContactDetails(contact, scanner);
            System.out.println("\nContact Updated Successfully.\n");
            System.out.println(contact);
        } else {
            System.out.println("\nContact Not Found.");
        }
        System.out.println();
    }

    private static void deleteContact(AddressBook addressBook, Scanner scanner) {
        System.out.println("\n--- Delete Contact ---");
        System.out.print("Enter First Name of contact to delete: ");
        String name = scanner.nextLine().trim();
        boolean deleted = addressBook.deleteContactByFirstName(name);

        if (deleted) {
            System.out.println("\nContact Deleted Successfully.");
        } else {
            System.out.println("\nContact Not Found.");
        }
        System.out.println();
    }

    private static void displayContacts(AddressBook addressBook) {
        System.out.println("\n--- All Contacts ---");
        List<Contact> contacts = addressBook.getContactList();
        if (contacts.isEmpty()) {
            System.out.println("No Contacts Available.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("Contact #" + (i + 1) + ":");
                System.out.println(contacts.get(i));
                System.out.println("-------------------------------------");
            }
        }
        System.out.println();
    }
}
