package MapImplementation;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main (String [] args)
    {
        // creating an empty hash map
        Map<String, Integer> map = new LinkedHashMap<>();

        // Inserting the Pair entries in above map
        map.put("Vishal" , 10);
        map.put("Sachin", 30);
        map.put("Vaibhav", 20);

        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }

}
