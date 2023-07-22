package JDBCProgramm;

import java.sql.*;
import java.util.Scanner;

public class DatabaseMetaDeta {
    public static void main (String [] args){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Scanner scanner = null;
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String path = "oracle.jdbc.driver.OracleDriver";
        String user = "system";
        String password = "system";


        try{
            Class.forName(path);
            System.out.println("Driver Loaded");
            connection = DriverManager.getConnection(url,user,password);
            DatabaseMetaData databaseMetaDeta = connection.getMetaData();
            System.out.println(databaseMetaDeta.getDatabaseProductName());

            System.out.println(databaseMetaDeta.getDatabaseProductVersion());
            System.out.println(databaseMetaDeta.getDriverMajorVersion());
            System.out.println(databaseMetaDeta.getDatabaseMinorVersion());
        }
        catch (Exception e){

            e.printStackTrace();
        }
    }
}
