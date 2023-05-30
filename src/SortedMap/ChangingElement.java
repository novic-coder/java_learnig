package SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class ChangingElement {

    public static void main (String [] args)
    {
        // Initializing the sortedMao using Generics

        SortedMap<Integer, String> tm = new TreeMap<Integer, String>();

        // Inserting the elements
        tm.put(3, "Geeks");
        tm.put(2, "Geeks");
        tm.put(1, "Geeks");

        System.out.println(tm);

        tm.put(2, " for");

        System.out.println(tm);
    }
}
