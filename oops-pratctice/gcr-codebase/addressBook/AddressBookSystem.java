package addressBook;
import java.util.*;

public class AddressBookSystem {

    private Map<String, AddressBook> books = new HashMap<>();

    public void createAddressBook(String name) {
        if (books.containsKey(name)) {
            System.out.println("Address Book already exists");
        } else {
            books.put(name, new AddressBook());
            System.out.println("Address Book created: " + name);
        }
    }

    public AddressBook getAddressBook(String name) {
        return books.get(name);
    }

    public void displayAllBooks() {
        books.keySet().forEach(System.out::println);
    }
    
}

