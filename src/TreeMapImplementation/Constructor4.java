package TreeMapImplementation;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Constructor4 {

    static void Example4Constructor()
    {
        SortedMap<Integer, String> sorted_map = new ConcurrentSkipListMap<Integer, String>();

        // Mapping String values into int Keys
        //Using put() method

        sorted_map.put(10, "Geeks");
        sorted_map.put(15, "4");
        sorted_map.put(20, "Geeks");
        sorted_map.put(25, "Welcomes");
        sorted_map.put(30, "you");

        // Creating the TreeMap using the SortedMap

        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(sorted_map);

        // Printing the element of Tree Map

        System.out.println("TreeMap: "+ tree_map);
    }

    // Method 2
    // Main driver Method

    public  static void main (String [] args)
    {
        System.out.println("TreeMap using TreeMap(Sorted Mao) Constructed");

        Example4Constructor();
    }
}
