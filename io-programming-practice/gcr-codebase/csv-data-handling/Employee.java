import java.io.*;
class Employee{
    public static void main(String[] args) throws Exception {
        String filePath= "E:\\BridgeLabz-Training\\io-programming-practice\\EmployeeData.csv";
        try (BufferedWriter br = new BufferedWriter(new FileWriter(filePath))){
            br.write("ID,Name,Department,Salary\n");
            br.newLine();
            br.write("101,John Doe,Engineering,75000\n");
            br.newLine();
            br.write("102,Jane Smith,Marketing,65000\n");
            br.newLine();
            br.write("103,Bob Johnson,Sales,55000\n");
            br.newLine();
            br.write("104,Alice Williams,HR,60000\n");
            br.newLine();
            br.write("105,Chris Evans,Finance,70000\n");
            System.out.println("Employee data written to file successfully.");
        }
        catch(Exception e ){
             e.printStackTrace();

        }
        
    }
}