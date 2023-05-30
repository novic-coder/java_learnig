package JDBCProgramm;

import oracle.jdbc.driver.OracleDriver;

import java.sql.DriverManager;

public class Firstjdbc {

    //Loading the driver

    // it can be done either by using registerDriver() or forName()

    public static void main (String [] args){

        // Approach 1
        try {
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Driver loaded Successfully");
        }
        catch (Exception e){
            System.out.println("Some probllem occured while connecting");
        }

        // Approach 2

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
