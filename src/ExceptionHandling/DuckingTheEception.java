package ExceptionHandling;

import java.util.Scanner;

class AtmMachine {

    // ducking -- process of leaving the exception withount handling
    public void acceptInput() throws Exception
    {
        try{
            System.out.println("Connection is Established");
            Scanner scan = new Scanner(System.in);
            System.out.println("enter numerator ");
            int num = scan.nextInt();
            System.out.println("Enter Denominator ");
            int den = scan.nextInt();
            int res = den/num;
            System.out.println("The result is "+res);
        }
        finally {
            System.out.println("Connection is closed");
        }
    }
}

public class DuckingTheEception {
    public static void main (String [] args)
    {
        try
        {
            System.out.println("Main Connection is Established");
            AtmMachine atm = new AtmMachine();
            atm.acceptInput();
            System.out.println("Main Connection is Closed");
        }
        catch (Exception e)
        {
            System.out.println("Exception handled in caller");
        }
    }
}