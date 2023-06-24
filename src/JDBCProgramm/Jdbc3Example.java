package JDBCProgramm;

import oracle.jdbc.driver.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc3Example {
    // Load driver establish the connection
    public static void main (String [] args){
        // loading the driver

        try{
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Driver is loaded");

            //Establishing the connection
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","system");
            System.out.println("Collection is established");
            System.out.println(connection);

            // Statement Established
            Statement statement = connection.createStatement();
            System.out.println("Statement Medium created");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
