package ExceptionHandling;

class Demo5 {
    // while overriding the method in child class if parent class os throwing an exception
    // in child class it may throw the exception or may not throw the exception.

    public void  greet() throws Exception
    {
        System.out.println("Hello");
    }
}
class Demo4 extends Demo5{
    public void greet() throws Exception {
        try {
            System.out.println("Hello kodnest");
        }
        catch (Exception e)
        {
            System.out.println("Exception is handled");
        }
    }
}
public class LPSRule1{
    public static void main (String [] args) throws Exception {
        Demo4 demo = new Demo4();
        demo.greet();
    }
}
