package HashCodes;

public class HashCodeExample1 {

    public static void main (String args []){

        String a = "1000";
        String b = "2000";
        String c = a;

        // Printing the hascodes of a and b

        System.out.println("Hash code of a "+a.hashCode());
        System.out.println("Hash code of b "+b.hashCode());
        System.out.println("Hash code of c "+c.hashCode());

        String d = "500";
        System.out.println("Hash Code of d "+d.hashCode());
    }


}
