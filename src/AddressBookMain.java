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

        Contact contact = ConsoleHelper.readContact(scanner);
        addressBook.addContact(contact);

        System.out.println("\nContact Added Successfully.\n");
        System.out.println(contact);

        scanner.close();
    }
}
