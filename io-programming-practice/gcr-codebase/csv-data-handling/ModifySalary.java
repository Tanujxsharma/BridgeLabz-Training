import java.io.*;
class ModifySalary {
    public static void main(String[] args) {
        String inputFile = "E:\\BridgeLabz-Training\\io-programming-practice\\EmployeeData.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(inputFile,true))) {
           while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns.length >= 4) {
                    try {
                        if(columns[2].equalsIgnoreCase("It")) {
                        double salary = Double.parseDouble(columns[3]);
                        salary *= 1.10; // Increase salary by 10%
                        columns[3] = String.format("%.2f", salary);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid salary format for employee: " + line);
                    }
                }
                bw.write(String.join(",", columns));
                bw.newLine();
            }
            System.out.println("Salaries updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}