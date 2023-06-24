package JDBCProgramm;

import java.sql.*;
import java.util.Scanner;

public class FindingData {
    public static void main (String [] args){


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        PreparedStatement preparedStatement = null;

        String user = "system";
        String password = "system";
        String sql = "Select * from student where id = ?";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver is loaded");

            // Establishing the connection
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connection is established");

            preparedStatement = connection.prepareStatement(sql);
            System.out.println("prepared statement created");

            Scanner scan = new Scanner(System.in);
            System.out.println("enter the Unique id ");
            int uid = scan.nextInt();
            preparedStatement.setInt(1,uid);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next() ==true){
                String name = resultSet.getString("Name");
                int id = resultSet.getInt("ID");
                String pass = resultSet.getString("PASSWORD");
                int m1 = resultSet.getInt("MARKS1");
                int m2 = resultSet.getInt("MARKS2");
                int m3 = resultSet.getInt("MARKS3");
                int average = resultSet.getInt("AVERAGE");

                System.out.println(name+ " "+ id+ " "+ pass+ " "+m1+ " "+m2+ " "+m3+ " "+average);
            }
            else {
                System.out.println("please enter the valid uid");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
                resultSet.close();
                statement.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
