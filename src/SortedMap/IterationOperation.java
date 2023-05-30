package SortedMap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class IterationOperation {

    public static void main (String [] args )
    {
        // Initialization iif the Sorted Map using Generics

        SortedMap<Integer, String> tm = new TreeMap<Integer, String>();

        // Inserting the elements

        tm.put(3, "Geeks");
        tm.put(2, "for");
        tm.put(1, "Geeks");

        for (Map.Entry mapElement : tm.entrySet()){
            int key = (int)mapElement.getKey();

            // finding the value

            String value = (String)mapElement.getValue();

            System.out.println(key+ " : "+ value);

        }
    }
}
