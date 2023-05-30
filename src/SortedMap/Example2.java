package SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Example2 {

    public static void main (String [] args) {
        SortedMap<String, String> tm = new TreeMap<String, String>() {
            public int compare(String a, String b) {
                return b.compareTo(a);

            }
        };

        // Adding elements into TreeMap using Put()

        tm.put("India","1");
        tm.put("Australia","2");
        tm.put("South Africa","3");


        // Displaying the TreeMap

        System.out.println(tm);

        // Removing items from treeMap

        tm.remove("Australia");

        System.out.println("Map after removing Australia "+tm);


    }
}
