package MapImplementation;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Instantiation

        Map<String, Integer> tm = new TreeMap<>();

        // Inseting elements in tree map
        tm.put("Ravi", 99);
        tm.put("nikita", 98);
        tm.put("others", 100);

        // Iterating through the map

        for (Map.Entry<String, Integer> e : tm.entrySet())
            System.out.println(e.getKey()+ " "+ e.getValue());

    }
}
