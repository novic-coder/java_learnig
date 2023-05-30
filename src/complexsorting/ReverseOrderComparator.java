package complexsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseOrderComparator {

    // reverses using reverse order comparator

    public static void main (String [] args){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(100);
        arrayList.add(25);
        arrayList.add(150);
        arrayList.add(175);
        arrayList.add(75);
        arrayList.add(50);

        System.out.println(arrayList);

        Comparator c = Collections.reverseOrder();
        Collections.sort(arrayList,c);
        System.out.println(arrayList);


    }
}
