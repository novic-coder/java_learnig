package UseCase2;

public class InvalidSearch extends Exception{
    public String getMessage()
    {
        return "Please check with the Employee Id Entered.";
    }
}
