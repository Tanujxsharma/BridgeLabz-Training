import java.util.*;
import java.sql.*;
import java.sql.Date;

public class PatientManagement {
    private static final String url ="jdbc:mysql://localhost:3306/Hospital";
    private static final String userName="root";
    private static final String password ="Tanuj@210600";
    public void addPatient(String input ){
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            String data[] = input.split(":");
            String name = data[0];
            String contact = data[1];
            String email = data[2];
            String address = data[3];
            String date = data[4];
            Date dob = Date.valueOf(date);
            String bloodGroup = data[5];
            String query = "insert into patient (name,contact,email,address,dob,bloodGroup) value(?,?,?,?,?,?)";
           PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, contact);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setDate(5, dob);
            ps.setString(6, bloodGroup);
            int number = ps.executeUpdate();
            if(number >0){
                System.out.println("data added ");
            }
            else{
                System.out.println("data addtion faield ");
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void updatePatient(int patientId, String name, String contact,
                              String email, String address,
                              Date dob, String bloodGroup) {

        String query = "UPDATE patient SET name=?, contact=?, email=?, address=?, dob=?, bloodGroup=? WHERE patient_id=?";

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setString(2, contact);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setDate(5, dob);
            ps.setString(6, bloodGroup);
            ps.setInt(7, patientId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Update Successful ");
            } else {
                System.out.println("Patient not found ");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void searchPatient(int patientId){
        String query = "select * from patient where patientId = ?";
        try(Connection connection =DriverManager.getConnection(url,userName,password);
            PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println( rs.getString("contact"));
                System.out.println( rs.getString("email"));
                System.out.println( rs.getString("address"));
                System.out.println( rs.getDate("dob"));
                System.out.println( rs.getString("bloodGroup"));
            }
        }
        catch(SQLException e ){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        PatientManagement pm = new PatientManagement();
        Scanner sc = new Scanner(System.in);
//            System.out.println("enter the details of patients in the form of string separated by :");
//            String input  = sc.nextLine();
//            pm.addPatient(input);
        pm.searchPatient(1);
    }
}
