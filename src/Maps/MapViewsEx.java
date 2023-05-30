package Maps;

import java.util.*;

public class MapViewsEx {

    // Map view are the methods that are used to view content of map
    // Kayset-- gives keys
    // valueSet -- gives Values
    // Entry Set - Gives Both Keys and Values

    public static void main (String [] args){
        HashMap hm = new HashMap();
        hm.put(100, 999);
        hm.put(200, 9999);
        hm.put(300, 99999);
        hm.put(400, 999999);

        System.out.println(hm);
// Implementation of Key Set

        Set keys = hm.keySet();
        Iterator itr1 = keys.iterator();
        while (itr1.hasNext() == true){
            System.out.print(itr1.next()+" ");
        }
        System.out.println();

        // Implementing value set

        Collection value = hm.values();
        Iterator itr2 = value.iterator();

        while (itr2.hasNext() == true){
            System.out.print(itr2.next()+ " ");
        }
        System.out.println();

        // ENtry Set

        Set kv =hm.entrySet();
        Iterator item3 = kv.iterator();
        while (item3.hasNext()==true){
            System.out.print(item3.next()+" ");
        }
        System.out.println();

    }
}
