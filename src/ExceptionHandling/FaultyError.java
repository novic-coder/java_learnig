package ExceptionHandling;

class Demo {
    public void alpha()
    {
        try {
            System.out.println("Connection Established");
            alpha();
            System.out.println("Connection closed");
        }
        catch (Exception e)
        {
            System.out.println("Error Caught ");
        }
    }
}
public class FaultyError {
    public static void main (String [] args)
    {
        Demo d = new Demo();
        d.alpha();
    }

    // Here faulty error are being provided by user hence it is not an Exception

}
