package JDBCProgramm;

import oracle.jdbc.driver.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC4Example {

    public static void main (String [] args){
        try{
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Driver is loaded");

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","system");
            System.out.println("Connection is established");

            Statement statement = connection.createStatement();
            System.out.println("Statement has been created");

            ResultSet resultSet = statement.executeQuery("select * from Student");
            System.out.println("Query Executed and result is stored in Programm");
            while(resultSet.next() == true){
                System.out.println(resultSet.getString(1)+ " "+
                        resultSet.getInt(2)+ " " +
                        resultSet.getString(3)+ " "+
                        resultSet.getInt(4)+" "+
                        resultSet.getInt(5)+ " "+
                        resultSet.getInt(6)+" "+
                        resultSet.getInt(7));
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
