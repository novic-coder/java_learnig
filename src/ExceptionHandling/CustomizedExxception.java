package ExceptionHandling;

import java.util.Scanner;

class ATM2{
    int account_no = 9999;
    int password = 8888;
    int acc;
    int pwd;
    public  void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account no");
        acc = scan.nextInt();
        System.out.println("Enter the password");
        pwd = scan.nextInt();


    }

    public void verify(){
        if (acc == account_no && pwd == password){
            System.out.println("Collect the money");
        }
        else {
            System.out.println("Invalid Credentials, Please try again");
        }
    }
}
class  Bank1 {
    public  void initiate()
    {
        ATM2 atm = new ATM2();
        atm.acceptInput();
        atm.verify();
    }
}


public class CustomizedExxception {
    public static void main (String [] args )
    {
        Bank1 b1 = new Bank1();
        b1.initiate();
    }
}
