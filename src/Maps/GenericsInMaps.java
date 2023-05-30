package Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class GenericsInMaps {

    // Use of generis in Map

    public static void main (String [] args){

        TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
        hm.put(500, "Ravi");
        hm.put(400, "Nikita");
        hm.put(300, "Jayshree");
        hm.put(200, "Akshay");
        hm.put(100, "Baby");

        System.out.println(hm);
    }
}
