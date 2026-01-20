import java.io.*;
class FilterRecords {
    public static void main(String[] args) {
        String inputFile = "E:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\FilteresStudent.csv";
        String outputFile = "E:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\FilteredStudents.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            // Write header to output file
            String header = br.readLine();
            bw.write(header);
            bw.newLine();

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns.length >= 4) {
                    int grade = Integer.parseInt(columns[3]);
                    if (grade >= 80) { // Filter condition: grade >= 80
                        bw.write(line);
                        bw.newLine();
                    }
                }
            }
            System.out.println("Filtered records written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}