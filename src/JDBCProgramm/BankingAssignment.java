package JDBCProgramm;

import java.sql.*;
import java.util.Scanner;

public class BankingAssignment {
    public static void main (String args []){
        System.out.println("Welcome to the Kodnest Banking System");
        System.out.println("please make a choice");
        System.out.println("1 ---> Login");
        System.out.println("2 ---> register");
        System.out.println("3 ---> view Balance");
        System.out.println("4 ---> Change Password");
        System.out.println("5 ---> delete Account");
        System.out.println("6 --> Exit");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String path = "oracle.jdbc.driver.OracleDriver";
        Scanner scanner = new Scanner(System.in);

        // System Configuration
        String user = "system";
        String password = "system";
        String insertQuerry = "insert into Bank values(?,?,?,?,?)";
        String sql = "Select balance from Bank where Account_no = ?";
        String Update = "Update Bank set password =? where Account_no = ?";
        String deleteQuery = "delete from bank where Account_no = ? and password= ?";
        String loginQuery = "Select Account_no,name from Bank where Account_no = ?";
        int choice;


        try{
            Class.forName(path);
            System.out.println("Driver is loaded");

            // Establishing Connection

            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connection is established");
            do{
                System.out.println("please make a choice");
                choice = scanner.nextInt();
                System.out.println("1 ---> Login");
                System.out.println("2 ---> register");
                System.out.println("3 ---> view Balance");
                System.out.println("4 ---> Change Password");
                System.out.println("5 ---> delete Account");
                System.out.println("6 --> Exit");
                switch (choice){
                    case 1:
                        System.out.println("Please enter Account number");
                        String Account_number = scanner.next();
                        System.out.println("please enter name");
                        String name = scanner.next();
                        preparedStatement = connection.prepareStatement(loginQuery);
                        System.out.println("Prepaed statement created");
                        preparedStatement.setString(1,Account_number);
                        resultSet = preparedStatement.executeQuery();
                        if (resultSet.next() == true){
                            String userAccountNum = resultSet.getString("ACCOUNT_NO");
                            String userName = resultSet.getString("NAME");
                            if (userAccountNum == Account_number && userName == name){
                                System.out.println("You have Sucessfully Logged in");
                            }
                            else {
                                System.out.println("please enter a valid Account no");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Please provide the details for new account");
                        preparedStatement = connection.prepareStatement(insertQuerry);
                        System.out.println("Prepared Statement created");
                        System.out.println("Please enter Account_no");
                        String acc_no = scanner.next();
                        System.out.println("Please enter name ");
                        String name1 = scanner.next();
                        System.out.println("Please enter the password");
                        String pass = scanner.next();
                        System.out.println("Please enter the Balance");
                        String balance = scanner.next();
                        System.out.println("Please enter the Account type");
                        String acc_type = scanner.next();

                        // Setting up the data base
                        preparedStatement.setString(1,acc_no);
                        preparedStatement.setString(2,name1);
                        preparedStatement.setString(3,pass);
                        preparedStatement.setString(4,balance);
                        preparedStatement.setString(5,acc_type);

                        int result = preparedStatement.executeUpdate();
                        System.out.println(result+ " rows affected");
                        break;

                    case 3:
                        preparedStatement= connection.prepareStatement(sql);
                        System.out.println("prepared statment created");

                        System.out.println("Enter the Account Number");
                        String acc = scanner.nextLine();
                        System.out.println("enter Password");
                        String pas = scanner.next();
                        preparedStatement.setString(1,acc);
                        resultSet = preparedStatement.executeQuery();
                        if (resultSet.getString("Account_no") == acc && resultSet.getString("password")==pas){
                            int balance1 =resultSet.getInt("balance");
                            System.out.println("The balance for "+acc+" is "+balance1);
                        }
                        break;
                    case 4:
                        preparedStatement = connection.prepareStatement(Update);
                        System.out.println("Enter the Account number");
                        String account_no = scanner.next();
                        System.out.println("please enter your password");
                        String passworrd1 = scanner.next();
                        preparedStatement.setString(2,account_no);
                        preparedStatement.setString(1,passworrd1);
                        int res = preparedStatement.executeUpdate();
                        System.out.println(res+" rows affected");
                        break;
                    case 5:
                        preparedStatement = connection.prepareStatement(deleteQuery);
                        System.out.println("Please enter account number");
                        String acc_no1 = scanner.next();
                        System.out.println("Please enter password");
                        String pass2 = scanner.next();
                        preparedStatement.setString(1,acc_no1);
                        preparedStatement.setString(2,pass2);
                        int result2 = preparedStatement.executeUpdate();
                        System.out.println("Account deleted successfully");
                        break;
                    case 6:
                        System.out.println("Thank you for using Kodnest bank");
                        break;

                }

            }
            while (choice<7);

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                statement.close();
                preparedStatement.close();
                scanner.close();

            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
