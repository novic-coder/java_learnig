package UseCase2;

public class InvalidEntry extends Exception{
    public String getMessage()
    {
        return "The entry is Invalid, Please check with the entry and try again";
    }
}
