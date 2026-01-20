import java.io.*;
class CountRows {
    public static void main(String[] args) {
        String csvFile = "E:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\CountRows.csv";
        String line;
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                rowCount++;
            }
            System.out.println("Total number of rows: " + (rowCount - 1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}