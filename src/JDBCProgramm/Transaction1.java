package JDBCProgramm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transaction1 {
    public static  void  main (String [] args){
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        Scanner scanner = null;
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String path = "oracle.jdbc.driver.OracleDriver";
        String user = "system";
        String password = "system";

        // SQL Queries

        String sql1 = "update Bank set balance = balance - ? where Account_no = ? and password = ?";
        String sql2 = "update Bank set balance = balance + ? where Account_no = ?";

        try{
            Class.forName(path);
            connection = DriverManager.getConnection(url,user,password);

            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement2 = connection.prepareStatement(sql2);

            scanner = new Scanner(System.in);
            System.out.println("Please enter the senders account");
            String senderAccount = scanner.next();
            System.out.println("Please enter your Password");
            String sendersPassword = scanner.next();
            System.out.println("Please enter receiver account number ");
            String receiverAccount = scanner.next();
            System.out.println("Please enter the Amount");
            String amount_to_Send = scanner.next();

            preparedStatement1.setInt(1, Integer.parseInt(amount_to_Send));
            preparedStatement1.setString(2,senderAccount);
            preparedStatement1.setString(3,sendersPassword);
            int result1 = preparedStatement1.executeUpdate();
            System.out.println(result1+ " account debited");
            System.out.println(amount_to_Send+ " has been debited from account "+senderAccount);

            preparedStatement2.setInt(1, Integer.parseInt(amount_to_Send));
            preparedStatement2.setString(2,receiverAccount);

            int result2 = preparedStatement2.executeUpdate();
            System.out.println(result2+ " account debited");
            System.out.println(amount_to_Send+" has been credited to account "+receiverAccount);

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
                preparedStatement1.close();
                preparedStatement2.close();
                scanner.close();
            }
            catch (SQLException e ){
                e.printStackTrace();
            }
        }
// This programm is inefficient to handle errors and mistakes in transaction because it contains more than one statement to execute


    }
}
