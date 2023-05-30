package Introduction;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    // main method

    public static void main (String args [])
    {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(1,"Geeks");
        hm.put(2,"for");
        hm.put(3,"Geeks");

        //Finding the value for a key

        System.out.println("Value for 1 is " + hm.get(1));


        //Traversing through the HashMap

        for (Map.Entry<Integer,String> e : hm.entrySet())
            System.out.println(e.getKey()+ " "+e.getValue());
    }
}
