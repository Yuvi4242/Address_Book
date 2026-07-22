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
}
