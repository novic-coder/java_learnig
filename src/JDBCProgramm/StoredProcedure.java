package JDBCProgramm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StoredProcedure {
    public static void main(String args[]) {
        try {
            Connection con = null;
            CallableStatement stmt = null;
            ResultSet resultSet = null;
            String path = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/kodnest";
            String user = "root";
            String password = "mysql@root@123";
            String sql = "call function2()";

            Class.forName(path);
            con = DriverManager.getConnection(url,user,password);
            stmt = con.prepareCall(sql);
            boolean result = stmt.execute();
            if (result == true){
                System.out.println("Select query has been executed");
                resultSet = stmt.getResultSet();
                while (resultSet.next() == true){
                    System.out.println(resultSet.getInt(1)+ " " +
                            " "+ resultSet.getString(2)+ " "+ resultSet.getString(3));
                }
            }
            else {
                System.out.println("DML command executed");
                int nora = stmt.getUpdateCount();
                System.out.println(nora);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
