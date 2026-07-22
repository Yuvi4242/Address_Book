import model.Contact;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println(" Welcome To Address Book System");
        System.out.println("=====================================");
        System.out.println();

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
    }
}
