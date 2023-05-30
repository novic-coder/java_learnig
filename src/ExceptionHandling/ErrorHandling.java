package ExceptionHandling;

class NewDemo{
    public void alpha()
    {
        try{
            System.out.println("Connection is Established ");
            alpha();
            System.out.println("Connection is Closed");

        }
        catch (Error e)
        {
            System.out.println("Error Caught");
        }
    }
}
public class ErrorHandling {
    public static void main (String [] args)
    {
        NewDemo d1 = new NewDemo();
        d1.alpha();
    }

}
