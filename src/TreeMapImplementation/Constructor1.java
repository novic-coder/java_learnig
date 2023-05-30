package TreeMapImplementation;

import java.util.TreeMap;

public class Constructor1 {
    // Method1
    // To show TreeMap CInstructor

    static void Example1stConstructor()
    {
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

        // Mapping string Value to int keys
        // using put() method

        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "you");

        // Printing the elements of TreeMap

        System.out.println("TreeMap: " +tree_map);

    }
    // Method 2 i.e main Driver Method

    public static void main (String [] args)
    {
        System.out.println("TreeMap Using Treemap () Constructor:\n");

        // Calling constructor
        Example1stConstructor();
    }

}
