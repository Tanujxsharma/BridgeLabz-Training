import java.io.*;
public class Student {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filePath= "E:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\StudentData.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line;
			 while ((line = br.readLine()) != null) {
				  if (line.trim().isEmpty()) {
	                    continue;
				  }
	                String[] columns = line.split(",");
	                System.out.println("ID: " + columns[0] + ", Name: " + columns[1]+" age is : "+columns[2]+" and the grade is : "+columns[3]);

	            }

		}
		catch(Exception e ){
			 e.printStackTrace();

		}
		
	
	}

}
