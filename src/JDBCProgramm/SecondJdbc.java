package JDBCProgramm;

import oracle.jdbc.driver.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SecondJdbc {

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
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
