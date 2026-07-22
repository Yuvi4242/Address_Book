package service;

import model.Contact;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contactList;

    public AddressBook() {
        this.contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public Contact findContactByFirstName(String firstName) {
        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                return contact;
            }
        }
        return null;
    }

    public boolean deleteContactByFirstName(String firstName) {
        Contact contact = findContactByFirstName(firstName);
        if (contact != null) {
            return contactList.remove(contact);
        }
        return false;
    }
}
