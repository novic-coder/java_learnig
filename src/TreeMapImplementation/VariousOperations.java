package TreeMapImplementation;

import java.util.Map;
import java.util.TreeMap;

public class VariousOperations {

    public static void main (String [] args)
    {
        // Default Initialization oof tree Map
        TreeMap tm1 = new TreeMap();

        // Inserting the elements in TreeMap
        // Using put method

        tm1.put(3,"Geeks");
        tm1.put(2,"for");
        tm1.put(1,"Geeks");

        // Initialization of a TreeMap using Generics

        TreeMap<Integer,String> tm2 = new TreeMap<Integer,String>();

        // Intresting the elements in Treemap
        tm2.put(new Integer(3), "Geeks");
        tm2.put(new Integer(2), "For");
        tm2.put(new Integer(1), "Geeks");

        // Printing the elements of both TreeMaps

        // Map1
        System.out.println(tm1);
        // Map 2
        System.out.println(tm2);

        // Updating the elements

        TreeMap<Integer,String> tm3 = new TreeMap<Integer,String>();
        tm3.put(3, " Geeks");
        tm3.put(2, "Geeks");
        tm3.put(1, "Geeks");

        // Print all current elements in Map
        System.out.println(tm3);

        // Inserting the element at specified location
        tm3.put(2, " for");

        System.out.println(tm3);



        // Removing the elements from the Map
        TreeMap<Integer,String> tm4 = new TreeMap<Integer,String>();

        // Inserting the elements

        tm4.put(3, " Geeks");
        tm4.put(2, "Geeks");
        tm4.put(1, " geeks");
        tm4.put(4, " For");

        System.out.println(tm4);

        // removing the element
        tm4.put(2,"for");
        tm4.remove(4);
        System.out.println(tm4);

        // Iterating through the Map
        for (Map.Entry mapElement : tm4.entrySet())
        {
            int key = (int)mapElement.getKey();

            // finding the value

            String value = (String)mapElement.getValue();

            // Printing the key and value
            System.out.println(key+ " : "+value);
        }
    }
}
