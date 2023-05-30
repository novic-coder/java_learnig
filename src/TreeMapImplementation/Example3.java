package TreeMapImplementation;

import java.util.Map;
import java.util.TreeMap;

public class Example3 {

    // Declaring a TreeMap

    static TreeMap<Integer, String> tree_map;


    // Method 1 - To create TreeMap

    static  void create()
    {
        // Creating an empty TreeMap

        tree_map  = new TreeMap<Integer, String>();

        // Display Message only

        System.out.println("TreeMap Successfully Created");
    }

    // Method 2 -- To Insert values in the TreeMap

    static void insert()
    {
        // Mapping String Values to into Keys
        // Using put() method

        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "you");

        // Displaying the Inserted message

        System.out.println("Elements successfully Inserted in Tree map");
    }

    // Method 3
    static void search(int key)
    {
        // Checking for key in the Map

        System.out.println("\nIS key \""+key + "\"present? "+ tree_map.containsKey(key));
    }

    // Method 4
    // To search a value in TreeMap
    static  void search(String value)
    {
        // Checking the Value
        System.out.println("Displaying thr TreeMap :");
        System.out.println("TreeMap : "+tree_map);
    }

    //Method 6 - To Traverse TreeMap

    static void traverse()
    {
        // Displaying message only
        System.out.println("n Traversing the TreeMap :");
        for (Map.Entry<Integer,String> e : tree_map.entrySet())
            System.out.println(e.getKey() + " "+e.getValue());
    }

    public static void main (String [] args){
        create();

        // Inserting the vales in Tree Map
        // Inserting the element in tree

        insert();

        // Searching the key "50" in the Tree Map

        search(50);
        // Displaying the elemet in tree Map
        traverse();

    }
}
