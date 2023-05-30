package TreeMapImplementation;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMapM {
    static void Example3rdConstructor()
    {
        // Creating an Empty Hashmap
        Map<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping String Values into keys

        // using Put Method

        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "welcomes");
        hash_map.put(30, "you");

        // Creating the TreeMap using the Map
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(hash_map);


        // Printing the elements of TreeMap

        System.out.println("Tree<ap: "+tree_map);

    }

    public static void main (String [] args)
    {
        System.out.println("TreeMap using TreeMap and constructor");
        Example3rdConstructor();
    }

}
