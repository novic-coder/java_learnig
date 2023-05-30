package HashCodes;

public class HashingWithoutParameter {

    public static void main (String [] args){
        // Creating Integer object
        Integer val = new Integer("189");

        // Compute the hascode of this integer object

        int hashValue = val.hashCode();

        System.out.println("Hash code of val is "+ hashValue);
    }
}
