package SortedMap;

import java.util.*;

public class Example1 {
    public static void main (String [] args)
    {
        SortedMap<Integer, String> sm = new TreeMap<Integer,String>();
        sm.put(new Integer(2), "Practice");
        sm.put(new Integer(3), "quiz");
        sm.put(new Integer(5), "Code");
        sm.put(new Integer(4), "Contribute");
        sm.put(new Integer(1), "Geeks for geeks");

        Set s = sm.entrySet();

        // using iterator in sorted map

        Iterator i = s.iterator();

        // Traversing map
        // Note that the traversal prodced sorted by keys output

        while ((i.hasNext())){
            Map.Entry m = (Map.Entry)i.next();

            int Key = (Integer)m.getKey();
            String value = (String)m.getValue();

            System.out.println("Key : "+Key + "  Value " +value);

        }

    }
}
