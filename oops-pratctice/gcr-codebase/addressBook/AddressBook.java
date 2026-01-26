package addressBook;
import java.util.*;

public class AddressBook {

    Scanner sc = new Scanner(System.in);
    Map<String, Address> map = new HashMap<>();

    public void addContact(String name, String address, String city,
                           String state, int pincode,
                           String phoneNumber, String email) {

        if (map.containsKey(phoneNumber)) {
            System.out.println("Contact already exists");
            return;
        }

        Address ad = new Address(name, address, city, state, pincode, phoneNumber, email);
        map.put(phoneNumber, ad);
        System.out.println("Contact added successfully");
    }

    public void editContact(String name) {

        Address found = null;

        for (Address a : map.values()) {
            if (a.getName().equalsIgnoreCase(name)) {
                found = a;
                break;
            }
        }

        if (found == null) {
            System.out.println("Contact not found");
            return;
        }

        boolean loop = true;
        while (loop) {
            System.out.println("""
                1.Name
                2.Address
                3.City
                4.State
                5.Pincode
                6.Email
                7.Exit
                """);

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter new name: ");
                    found.setName(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter new address: ");
                    found.setAddress(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter new city: ");
                    found.setCity(sc.nextLine());
                }
                case 4 -> {
                    System.out.print("Enter new state: ");
                    found.setState(sc.nextLine());
                }
                case 5 -> {
                    System.out.print("Enter new pincode: ");
                    found.setPincode(sc.nextInt());
                    sc.nextLine();
                }
                case 6 -> {
                    System.out.print("Enter new email: ");
                    found.setEmail(sc.nextLine());
                }
                case 7 -> loop = false;
                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("Contact updated successfully");
    }

    public void deleteUser(String name) {

        Iterator<Map.Entry<String, Address>> it = map.entrySet().iterator();
        boolean removed = false;

        while (it.hasNext()) {
            Address a = it.next().getValue();
            if (a.getName().equalsIgnoreCase(name)) {
                it.remove();
                removed = true;
                break;
            }
        }

        if (removed)
            System.out.println("Contact deleted");
        else
            System.out.println("Contact not found");
    }

    public void displayContacts() {
        if (map.isEmpty()) {
            System.out.println("Address Book is empty");
            return;
        }
        map.values().forEach(System.out::println);
    }
}
