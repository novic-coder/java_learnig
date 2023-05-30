package collectionProperties;

import java.util.Iterator;
import java.util.LinkedList;

public class DescIterator {
    public static void main (String [] args){
        LinkedList ls = new LinkedList();
        ls.add(100);
        ls.add(120);
        ls.add(130);
        ls.add(140);
        ls.add(150);
        ls.add(160);
        ls.add(170);
        ls.add(180);
        ls.add(190);
        ls.add(200);
        System.out.println(ls);
        System.out.println("----------------------------------------");

        // Descending iterator will be used

        Iterator itr = ls.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
