package MapImplementation;

import java.util.HashMap;
import java.util.Map;

public class Eample1 {

    public static void main (String [] args)
    {
        Map<String, Integer> hm = new HashMap<String, Integer>();

        // Inserting pairs in above Map

        hm.put("Ravi", new Integer(100));
        hm.put("Nikita", new Integer(200));
        hm.put("Ayushi", new Integer(300));
        hm.put("Manish", new Integer(400));

        // Traversing through Map using for each loop

        for (Map.Entry<String, Integer> me :
                hm.entrySet()){
            // Printing

            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}
