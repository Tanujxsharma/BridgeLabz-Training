import java.sql.*;
import java.util.Scanner;
public class DoctorManagement {
    private static final String url = "jdbc:mysql://localhost:3306/Hospital";
    private static final String userName = "root";
    private static final String password = "Tanuj@210600";

    public void addDoctor(String input){

        String data[] = input.split(":");
        String name = data[0];
        String contact = data[1];
        double fee = Double.parseDouble(data[2]);
        int specialtyId = Integer.parseInt(data[3]);
        String checkSpecialty = "SELECT * FROM specialties WHERE specialty_id = ?";
        String insertDoctor = "INSERT INTO doctors (name, contact, consultation_fee, specialty_id) VALUES (?, ?, ?, ?)";
        try(Connection connection = DriverManager.getConnection(url,userName,password);
            PreparedStatement checkPs = connection.prepareStatement(checkSpecialty);
            PreparedStatement insertPs = connection.prepareStatement(insertDoctor)){
            checkPs.setInt(1, specialtyId);
            ResultSet rs = checkPs.executeQuery();
            if (!rs.next()) {
                System.out.println("Specialty not found!");
                return;
            }
            insertPs.setString(1, name);
            insertPs.setString(2, contact);
            insertPs.setDouble(3, fee);
            insertPs.setInt(4, specialtyId);
            int rows = insertPs.executeUpdate();
            if(rows>0){
                System.out.println("inserted successfully ");
            }
            else{
                System.out.println("kuch to gadbad he re baba ");
            }
        }
        catch(SQLException e ){
            System.out.println(e.getMessage());
        }
    }
    public void showDoctor(String name){
        String query = "select * from doctors where name = ?";
        try(Connection connection = DriverManager.getConnection(url,userName,password);
        PreparedStatement ps= connection.prepareStatement(query)){
            ps.setString(1,name);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println("Doctor ID: " + rs.getInt("doctor_id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Contact: " + rs.getString("contact"));
                System.out.println("Fee: " + rs.getDouble("consultation_fee"));
                System.out.println("Specialty ID: " + rs.getInt("specialty_id"));
            }
            else{
                System.out.println("nahi mila bhai re ");
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void updateDoctorSpecialty(int doctorId, int newSpecialtyId) {

        String showSpecialties = "SELECT * FROM specialties";
        String updateQuery = "UPDATE doctors SET specialty_id = ? WHERE doctor_id = ?";

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {

            connection.setAutoCommit(false);

            try (PreparedStatement showPs = connection.prepareStatement(showSpecialties);
                 ResultSet rs = showPs.executeQuery()) {

                while (rs.next()) {
                    System.out.println(
                            rs.getInt("specialty_id") + " - " +
                                    rs.getString("specialty_name")
                    );
                }
            }

            try (PreparedStatement updatePs = connection.prepareStatement(updateQuery)) {

                updatePs.setInt(1, newSpecialtyId);
                updatePs.setInt(2, doctorId);

                int rows = updatePs.executeUpdate();

                if (rows > 0) {
                    connection.commit();
                    System.out.println("Doctor specialization updated successfully");
                } else {
                    connection.rollback();
                    System.out.println("Doctor not found");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        DoctorManagement dm = new DoctorManagement();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the doctor details separated by :");
//        String input = sc.nextLine();
//        dm.addDoctor(input);
        dm.showDoctor("halku jhopdiwala");
        dm.updateDoctorSpecialty(1,3);
        dm.showDoctor("halku jhopdiwala");
    }
}
