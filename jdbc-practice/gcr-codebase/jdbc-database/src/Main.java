import java.sql.*;
public class Main {
    // ye jo he ye je basic jdbc ki basic plate
//    ye to hog hi hoga
    // ye he url
//    private static final String url = "jdbc:mysql://localhost:3306/?user=root";
    // ye he aapka username
//    private static final String userName="root";
    //ye he aapka password
//    private static final String password="Tanuj@210600";

//    public static void main(String[] args) {
//        try {
    // ye line sare drivers lode karti he iisko aaases hi likh dena he
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//        }
//        catch(ClassNotFoundException e){
    // ye vali line uper vali line ka exception handle kati he
//            System.out.println(e.getMessage());
//        }
//        try{
    // ye connection interface ka use karke hum connection banate he  sql server se
//            Connection connection = DriverManager.getConnection(url,userName,password);
    // ye line statement interface ka use karke statement create karti he and crud operation karhe he iis se
//            Statement statement = connection.createStatement();
//        }
//        catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
    private static final String url = "jdbc:mysql://localhost:3306/jdbcpractice";
    private static final String userName="root";
    private static final String password="Tanuj@210600";
    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//        }
//        catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();

            String query = "select * from student ";
            String insertQuery = String.format("insert into student (name , age ) values('%s'  , %o)", "bhosad chattu",28);
            int number  = statement.executeUpdate("insert into student (name , age) values('chalu',33)");
            ResultSet rs =  statement.executeQuery(query);
            while (rs.next()){
               int id = rs.getInt("id");
               String name = rs.getString("name");
               int age  = rs.getInt("age");
               System.out.println(id);
               System.out.println(name);
               System.out.println(age);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}