package JDBCProgramm;

import oracle.jdbc.driver.OracleDriver;

import java.sql.DriverManager;

public class Firstjdbc {

    //Loading the driver
    public static void main (String [] args){
        try {
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Driver loaded Successfully");
        }
        catch (Exception e){
            System.out.println("Some probllem occured while connecting");
        }

    }
}
