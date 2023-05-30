package ExceptionHandling;

import java.util.Scanner;

class Demo1{
    public void Alpha(){
        System.out.println("Connection 3 is established");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Numerator");
        int num = scan.nextInt();
        System.out.println("Enter denominator ");
        int dem = scan.nextInt();
       int result = num/dem;
       System.out.println("The result is "+result);
       System.out.println("Connection 3 is closed");
    }
}
class Demo2{
    public void beta(){
        System.out.println("Connection 2 is established");

        Demo1 d1 = new Demo1();
        d1.Alpha();
        System.out.println("Connection 2 is closed");
    }
}

class Demo3{
    public void gamma(){
        System.out.println("Connection 1 is established");
        Demo2 d2 = new Demo2();
        d2.beta();
        System.out.println("Connection 1 is closed ");
    }
}
public class ExceptionHierarchy {
    public static void main (String [] args)
    {
        System.out.println("Main Connection is established");
        Demo3 d3 = new Demo3();
        d3.gamma();
        System.out.println("Main Collection is closed");
    }


}
