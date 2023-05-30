package SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class AdditionOperation {
    public static void main (String [] args)
    {
        // Default Initilization of a Sorted map

        SortedMap tm1 = new TreeMap();

        // Initialization of Sorted map using Sorted Map Using genericcs

        SortedMap<Integer, String> tm2 = new TreeMap<Integer, String>();

        // Inserting the element

        tm1.put(3, "Geeks");
        tm1.put(2, "for");
        tm1.put(1, "Geeks");


        tm2.put(new Integer(3), "Geeks");
        tm2.put(new Integer(2), "For");
        tm2.put(new Integer(1), "Geeks");


        System.out.println(tm1);
        System.out.println(tm2);
    }
}
