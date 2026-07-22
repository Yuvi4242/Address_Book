# 📇 Address Book System

A clean, console-based Java application built using **Object-Oriented Programming (OOP)** principles to manage personal or business contact information efficiently.

---

## 🌟 Features & Use Cases

The system implements the following progressive Use Cases (UC1 - UC5):

- **UC1: Contact Model Design**
  - Encapsulates contact details (`firstName`, `lastName`, `address`, `city`, `state`, `zip`, `phoneNumber`, `email`).
  - Implements constructors, encapsulation (private attributes, public getters/setters), and custom `toString()` formatting.

- **UC2: Contact Collection & Storage**
  - Utilizes dynamic memory storage using Java `ArrayList<Contact>`.
  - Prompts user input cleanly via `Scanner` and stores records in `AddressBook`.

- **UC3: Edit Existing Contact**
  - Allows searching contacts by `firstName` (case-insensitive).
  - Updates contact attributes (`address`, `city`, `state`, `zip`, `phoneNumber`, `email`) while preserving the immutable primary name identifier.

- **UC4: Delete Contact**
  - Enables removing contact entries by `firstName` using `ArrayList.remove()`.
  - Provides clear feedback when a contact is successfully deleted or not found.

- **UC5: Interactive Console Menu & Clean Architecture**
  - Continuous user loop (`while(true)`) with interactive `switch` case dispatching.
  - Dedicated modular methods for `addContact()`, `editContact()`, `deleteContact()`, and `displayContacts()`.
  - Displays formatted views of all contacts or an informative warning when the list is empty.

---

## 📁 Project Directory Structure

```text
AddressBook/
├── .gitignore
├── README.md
└── src/
    ├── AddressBookMain.java        # Main Application Driver & Console Loop
    ├── model/
    │   └── Contact.java            # Contact Entity Model (OOP Encapsulation)
    ├── service/
    │   └── AddressBook.java        # Service Layer for Managing Contact Collections
    └── util/
        └── ConsoleHelper.java      # Utility for Scanner I/O & Contact Manipulations
```

---

## 🛠️ Prerequisites & Setup

### Requirements
- **Java Development Kit (JDK)**: Version 8 or higher
- **Terminal / Command Prompt / PowerShell**

### 🚀 How to Run

1. **Clone or Open the Repository**
   ```bash
   cd AddressBook
   ```

2. **Compile the Java Source Files**
   ```bash
   javac -d bin src/AddressBookMain.java src/model/Contact.java src/service/AddressBook.java src/util/ConsoleHelper.java
   ```

3. **Run the Application**
   ```bash
   java -cp bin AddressBookMain
   ```

---

## 💻 System Menu & Workflow

```text
=========================
ADDRESS BOOK SYSTEM
=========================
1. Add Contact
2. Edit Contact
3. Delete Contact
4. Display All Contacts
5. Exit
Enter your choice: 
```

---

## 📑 Sample Console Output

### Adding a Contact
```text
--- Add Contact ---
Enter First Name: Jane
Enter Last Name: Smith
Enter Address: 100 Innovation Way
Enter City: San Francisco
Enter State: California
Enter Zip: 94105
Enter Phone Number: 555-019-2831
Enter Email: jane.smith@example.com

Contact Added Successfully.

Contact Details:
First Name   : Jane
Last Name    : Smith
Address      : 100 Innovation Way
City         : San Francisco
State        : California
ZIP          : 94105
Phone Number : 555-019-2831
Email        : jane.smith@example.com
```

### Displaying All Contacts
```text
--- All Contacts ---
Contact #1:
Contact Details:
First Name   : Jane
Last Name    : Smith
Address      : 100 Innovation Way
City         : San Francisco
State        : California
ZIP          : 94105
Phone Number : 555-019-2831
Email        : jane.smith@example.com
-------------------------------------
```

---

## 🏗️ Object-Oriented Design Principles

- **Encapsulation**: Private attributes within `Contact` class accessed only through getters/setters.
- **Single Responsibility Principle (SRP)**:
  - `Contact`: Represents data structure.
  - `AddressBook`: Manages collection & business logic operations.
  - `ConsoleHelper`: Manages terminal input/output formatting.
  - `AddressBookMain`: Controls application execution loop.
- **Clean Code**: Meaningful method names, organized package structure (`model`, `service`, `util`), and no hardcoded values.
