package UseCase2;

public class InvalidUpdate  extends Exception{
    public String getMessage()
    {
        return "The Update operation can not be done, please check with your entry";
    }
}
