package ExceptionHandling;


import java.util.Scanner;

class InvalidInputException extends  Exception{
    public String getMessage(){
        return " Invalid Input !! please try again";
    }
}

class BankAccount {
    int account_no = 9999;
    int password = 8888;
    int acc__no;
    int pwd;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Account no");
        acc__no = scan.nextInt();
        System.out.println("Enter the Password");
        pwd = scan.nextInt();
    }

    public void verify() throws InvalidInputException {
        if (acc__no == account_no && pwd == password)
        {
            System.out.println("Collect the money");
        }
        else
        {
            InvalidInputException exc = new InvalidInputException();
            System.out.println(exc.getMessage());
            throw exc;
        }
    }
}

class Bankapp{
    public void initiate()
    {
        try
        {
            BankAccount ba = new BankAccount();
            ba.acceptInput();
            ba.verify();
        }
        catch (Exception e)
        {
            System.out.println("Exception reached blank");
        }
    }
}
public class CustomExc {
    public static void main (String [] args)
    {
        Bankapp bankaap = new Bankapp();
        bankaap.initiate();
    }

}
