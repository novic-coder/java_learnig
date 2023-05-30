package MapImplementation;

import java.util.HashMap;
import java.util.Map;

public class AdditionOperation {

    public static void main (String [] args)
    {
    // Instiation

        Map<Integer, String> hm1 = new HashMap<>();

        Map<Integer, String> hm2 = new HashMap<>();

        // Inserting the element

        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

        hm2.put(new Integer(1), "geeks");
        hm2.put(new Integer(2), "for");
        hm2.put(new Integer(3), "geeks");

        System.out.println(hm1);
        System.out.println(hm2);

        // Changing the elements

        Map<Integer, String> hm3 = new HashMap<>();

        // Inserting elements

        hm3.put(new Integer(1), "Java");
        hm3.put(new Integer(2), "ISS");
        hm3.put(new Integer(3), "Fun");

        System.out.println("Initial Map "+hm3);

        hm3.put(new Integer(2),"is");

        System.out.println("Updated Map "+hm3);


        // Removing the elements

        Map<Integer, String> hm4 = new HashMap<>();

        // Inserting elements

        hm4.put(new Integer(1), "Geeks");
        hm4.put(new Integer(2), "for");
        hm4.put(new Integer(3), "Geeks");
        hm4.put(new Integer(4), "for");

        System.out.println("Initial Map "+hm4);

        // removing the elements

        hm4.remove(new Integer(4));

        System.out.println("Final Map "+hm4);

    }
}
