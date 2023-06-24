package JDBCProgramm;

import java.sql.*;
import java.util.Scanner;

public class InsertingData {
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
        String sql = "insert into student values(?,?,?,?,?,?,?)";
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
            System.out.println("please enter the name");
            String a = scan.next();
            System.out.println("please enter the id");
            String b = scan.next();
            System.out.println("please enter the password");
            String c = scan.next();
            System.out.println("please enter the marks1");
            String d = scan.next();
            System.out.println("please enter the marks2");
            String e = scan.next();
            System.out.println("please enter the marks3");
            String f = scan.next();
            System.out.println("please enter the Average");
            String g = scan.next();

            // Setting the database

            preparedStatement.setString(1,a);
            preparedStatement.setString(2,b);
            preparedStatement.setString(3,c);
            preparedStatement.setString(4,d);
            preparedStatement.setString(5,e);
            preparedStatement.setString(6,f);
            preparedStatement.setString(7,g);

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
