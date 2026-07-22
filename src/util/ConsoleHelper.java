package util;

<<<<<<<<< Temporary merge branch 1
public class ConsoleHelper {
=========
import model.Contact;
import java.util.Scanner;

public class ConsoleHelper {
    public static Contact readContact(Scanner scanner) {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine().trim();

        System.out.print("Enter City: ");
        String city = scanner.nextLine().trim();

        System.out.print("Enter State: ");
        String state = scanner.nextLine().trim();

        System.out.print("Enter Zip: ");
        String zip = scanner.nextLine().trim();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine().trim();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine().trim();

        return new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
    }
>>>>>>>>> Temporary merge branch 2
}
