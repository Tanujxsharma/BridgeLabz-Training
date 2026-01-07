package JavaStreams.ObjectSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {

    private static final String FILE_NAME = "D:\\BridgeLabz-SIPP-Training\\JavaStreams\\ObjectSerialization\\employees.ser";

    public static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized successfully to " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }
    }

    public static List<Employee> deserializeEmployees() {
        List<Employee> employees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Employees deserialized successfully from " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found during deserialization: " + e.getMessage());
        }
        return employees;
    }

    public static void main(String[] args) {
        // 1. Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Sohil", "HR", 60000.0));
        employees.add(new Employee(2, "Tanuj", "Engineering", 85000.0));
        employees.add(new Employee(3, "Prakhar", "Marketing", 55000.0));

        // 2. Serialize the list of employees
        serializeEmployees(employees);

        // 3. Deserialize and display the employees
        List<Employee> deserializedEmployees = deserializeEmployees();
        if (deserializedEmployees != null) {
            System.out.println("\nDeserialized Employees:");
            for (Employee emp : deserializedEmployees) {
                System.out.println(emp);
            }
        }
    }
}