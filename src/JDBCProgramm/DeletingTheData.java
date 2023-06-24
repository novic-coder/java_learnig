package JDBCProgramm;

import java.sql.*;
import java.util.Scanner;

public class DeletingTheData {
    public static void main (String args []){
        // declaration s
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        // System Declarations

        String user = "system";
        String password = "system";
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String sql = "delete from student where id = ? and password = ?";
        String path = "oracle.jdbc.driver.OracleDriver";

        try {
            Class.forName(path);
            System.out.println("Driver is loaded");

            // Establishing the connection
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("connection is established");

            preparedStatement = connection.prepareStatement(sql);
            System.out.println("prepared statement created");
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter the id");
            String b = scan.next();
            System.out.println("please enter the password");
            String c = scan.next();


            // Setting the database

            preparedStatement.setString(1,b);
            preparedStatement.setString(2,c);

            int result = preparedStatement.executeUpdate();
            System.out.println(result+ "rows affected");


        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
                resultSet.close();
                statement.close();
                preparedStatement.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
