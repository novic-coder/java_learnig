package ExceptionHandling;

import java.util.Scanner;

class Atm{
    int amount =  100000;
    public void acceptInput() throws Exception
    {
        System.out.println("Connection is Established");
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the withdrawal Amount");
            int withdrawal_amount = scan.nextInt();
            if (withdrawal_amount < amount)
                amount = amount-withdrawal_amount;
            System.out.println("You withdrawn "+withdrawal_amount);
            System.out.println("the remaining amount is  "+amount);
        }
        catch (Exception e)
        {
            System.out.println("Some Problem Occurred");
            throw e;
        }
        finally {
            System.out.println("Collection is Closed");
        }

    }
}
public class ThrowsMethod {
    public static void main (String [] args)
    {
        try
        {
            System.out.println(" Main Connection is Established");
            Atm atm = new Atm();
            atm.acceptInput();
            System.out.println("Main connection is Closed ");
        }
        catch (Exception e)
        {
            System.out.println("Exception caught in bank");
        }
    }
}
