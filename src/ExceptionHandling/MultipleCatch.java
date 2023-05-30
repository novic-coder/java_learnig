package ExceptionHandling;

import java.util.Scanner;

public class MultipleCatch {
    public static void main (String [] args)
    {
        try{
            System.out.println("Connection Established ");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter denominator ");
            int den = scan.nextInt();
            System.out.println("Enter Numerator");
            int num = scan.nextInt();
            int result = den/num;
            System.out.println("result is "+result);

            System.out.println("Enter the length of an Array");
            int len = scan.nextInt();
            int arr [] = new int[len];
            System.out.println("enter the element you want to store ");
            int ele = scan.nextInt();
            System.out.println("enter the postion you want to store the element");
            int pos = scan.nextInt();
            arr[pos] = ele;
            System.out.println(" The element "+ele+ " is present within "+pos+" position");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Please enter a non zero number");
        }
        catch (NegativeArraySizeException e){
            System.out.println("Negative size array creation attempted");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are storing element out of boundary");
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Connection Closed");
    }
}

