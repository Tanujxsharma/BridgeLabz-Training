import java.io.*;
class SearchEmployee {
    public static void main(String[] args) {
        String filePath = "E:\\BridgeLabz-Training\\io-programming-practice\\EmployeeData.csv";
        String searchName = "Jane Smith"; // Name to search for
        String line;
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Read header
            String header = br.readLine();
            System.out.println(header);

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns.length >= 2 && columns[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Employee Found: " + line);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee with name '" + searchName + "' not found.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}