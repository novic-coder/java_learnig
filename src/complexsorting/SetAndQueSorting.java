package complexsorting;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class SetAndQueSorting {

    // sort() used to sort only list based classes
    // inorder to sort set and queue based we need to convert them to list first

    public static void main (String [] args){
        ArrayDeque ad = new ArrayDeque();
        ad.add(100);
        ad.add(50);
        ad.add(125);
        ad.add(25);
        ad.add(75);
        ad.add(50);
        ad.add(150);
        ad.add(175);

        System.out.println("Unsorted Deque "+ad);

        ArrayList arrayList = new ArrayList();
        arrayList.addAll(ad);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
