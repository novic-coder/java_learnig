package JDBCProgramm;

import java.sql.*;

public class Jdbc5StandardOfQuerrying {
    public static void main (String [] args){

        // declarations

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";

        String user = "system";
        String password = "system";
        String sql = "Select * from student";

        try{

            // Loading the drivers
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver is loaded");

            // Establishing the connection
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connection is established");

            // creating the statement
            statement = connection.createStatement();
            System.out.println("Statement is created");

            // Executing the Querry

            resultSet= statement.executeQuery(sql);
            System.out.println("Query Executed");

            // Displaying the result
            while (resultSet.next() == true){
                String name = resultSet.getString("Name");
                int id = resultSet.getInt("ID");
                String pass = resultSet.getString("PASSWORD");
                int m1 = resultSet.getInt("MARKS1");
                int m2 = resultSet.getInt("MARKS2");
                int m3 = resultSet.getInt("MARKS3");
                int average = resultSet.getInt("AVERAGE");

                System.out.println(name+ " "+ id+ " "+ pass+ " "+m1+ " "+m2+ " "+m3+ " "+average);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
                statement.close();
                resultSet.close();
            }
            catch (SQLException sql1){
                sql1.printStackTrace();

            }
        }
    }
}
