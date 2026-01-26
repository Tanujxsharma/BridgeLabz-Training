package addressBook;

import java.util.*;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();
        AddressBook currentBook = null;

        while (true) {
            System.out.println("\n=== Address Book System ===");
            System.out.println("1. Create Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Display All Address Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter address book name: ");
                    String name = sc.nextLine();
                    system.createAddressBook(name);
                }
                case 2 -> {
                    System.out.print("Enter address book name to select: ");
                    String name = sc.nextLine();
                    currentBook = system.getAddressBook(name);
                    if (currentBook != null) {
                        System.out.println("Selected address book: " + name);
                        addressBookMenu(sc, currentBook);
                    } else {
                        System.out.println("Address book not found.");
                    }
                }
                case 3 -> {
                    System.out.println("All Address Books:");
                    system.displayAllBooks();
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default ->
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addressBookMenu(Scanner sc, AddressBook book) {
        while (true) {
            System.out.println("\n=== Address Book Menu ===");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter city: ");
                    String city = sc.nextLine();
                    System.out.print("Enter state: ");
                    String state = sc.nextLine();
                    System.out.print("Enter pincode: ");
                    int pincode = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    book.addContact(name, address, city, state, pincode, phone, email);
                }
                case 2 -> {
                    System.out.print("Enter name to edit: ");
                    String name = sc.nextLine();
                    book.editContact(name);
                }
                case 3 -> {
                    System.out.print("Enter name to delete: ");
                    String name = sc.nextLine();
                    book.deleteUser(name);
                }
                case 4 -> {
                    book.displayContacts();
                }
                case 5 -> {
                    return; // back to main menu
                }
                default ->
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
