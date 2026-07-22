import model.Contact;
<<<<<<< HEAD
=======
import service.AddressBook;
import util.ConsoleHelper;

import java.util.Scanner;
>>>>>>> uc2

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println(" Welcome To Address Book System");
        System.out.println("=====================================");
        System.out.println();

<<<<<<< HEAD
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
=======
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        Contact contact = ConsoleHelper.readContact(scanner);
        addressBook.addContact(contact);

        System.out.println("\nContact Added Successfully.\n");
        System.out.println(contact);

        scanner.close();
>>>>>>> uc2
    }
}
