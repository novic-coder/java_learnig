package treeset;

import java.util.ArrayList;
import java.util.Collections;

public class SortingMethod {
    public static void main (String [] args){
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(125);
        al.add(150);
        al.add(75);
        al.add(25);
        al.add(200);
        al.add(175);

        System.out.println(al);
        System.out.println("--------------------------------------------------");
        Collections.sort(al);
        System.out.println(al);
    }
}
