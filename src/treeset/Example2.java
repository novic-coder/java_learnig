package treeset;

import java.util.TreeSet;

public class Example2 {

    // some methods in tree sets
    public static void main (String [] args){

        // Treeset
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts);
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ts.headSet(125));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ts.tailSet(125));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ts.higher(115));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ts.lower(115));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ts.ceiling(115));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ts.floor(115));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ts.higher(100));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ts.lower(100));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ts.ceiling(100));
        System.out.println("-------------------------------------------------------------------");
        System.out.println(ts.floor(100));
    }
}
