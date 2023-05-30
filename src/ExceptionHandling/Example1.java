package ExceptionHandling;

import java.util.Scanner;

public class Example1 {

    public static void main (String [] args)
    {
        try {
            System.out.println("Connection is Established");
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the Numerator ");
            int num = scan.nextInt();
            System.out.println("Enter the Numerator");
            int den = scan.nextInt();
            int result = num/den;
            System.out.println(result);
        }
        catch (Exception e)
        {
            System.out.println("Some Problem Occurred "+e);
        }
        System.out.println("Connection Closed");
    }
}
