package ExceptionHandling;

import java.util.Scanner;

class UnderageException extends Exception{
    public String getMessage()
    {
        return "You are too young to get Married";
    }
}

class OverageException extends  Exception {
    public String getMessage()
    {
        return "you are too old to get married";
    }
}

class Applicant
{
    int age;
    public void  acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        age = scan.nextInt();
    }

    public void Verify () throws  UnderageException, OverageException
    {
        if(age <= 18)
        {
            UnderageException uae = new UnderageException();
            System.out.println(uae.getMessage());
            throw  uae;
        }

        else if (age >= 45)
        {
            OverageException Oae = new OverageException();
            System.out.println(Oae.getMessage());
            throw Oae;
        }
        else {
            System.out.println("its perfect time to get married");
        }
    }
}

class  Matrimony{
    public void initiate()
    {
        Applicant a = new Applicant();
        try {
            a.acceptInput();
            a.Verify();
        }
        catch (Exception e)
        {
            System.out.println("You have left with 2 chance");
        }

        try{
            a.acceptInput();
            a.Verify();
        }
        catch (Exception e){
            System.out.println("You have only one chance");
        }

        try {
            a.acceptInput();
            a.Verify();
        }
        catch (Exception e)
        {
            System.out.println("You have exceeded the limit Please try again Later");
        }
    }
}
public class CustomException2 {
    public static void main (String [] args){
        Matrimony m1 = new Matrimony();
        m1.initiate();
    }
}
