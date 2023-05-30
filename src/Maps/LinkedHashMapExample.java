package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExample {

    //Hash map does not maintains the order of insertion

    public static void main (String [] args){

        // Instantiating the Hash Map
        HashMap hm = new HashMap();
        hm.put(500,123455);
        hm.put(400,123456);
        hm.put(300,54321);
        hm.put(200,7543);
        hm.put(100,98765);

        System.out.println("Hash map output "+hm);


        // Instantiating Linked Hash map
        // Preserves the order of insertion

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(500,123455);
        lhm.put(400,123456);
        lhm.put(300,54321);
        lhm.put(200,7543);
        lhm.put(100,98765);

        System.out.println("Linked Hash Map "+lhm);


        // Instantiating Tree Hash Map
        // It stores the data in Ascending order of the key

        TreeMap tm = new TreeMap();
        tm.put(500,123455);
        tm.put(400,123456);
        tm.put(300,54321);
        tm.put(200,7543);
        tm.put(100,98765);

        System.out.println("The tree hash map "+tm);

    }
}
