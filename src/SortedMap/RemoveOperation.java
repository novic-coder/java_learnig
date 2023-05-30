package SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class RemoveOperation {

    public static void main (String args [])
    {
        // Initializing the SortedMap Using Generics

        SortedMap<Integer, String> tm = new TreeMap<Integer, String>();

        // Inserting the element

        tm.put(3, " Geeks ");
        tm.put(2, " Geeks ");
        tm.put(1, " Geeks ");
        tm.put(4, " For ");

        System.out.println(tm);

        tm.remove(4);

        System.out.println(tm);
    }
}
