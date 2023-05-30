package complexsorting;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseMethodOfCollectionClass {

    // reverse order sorthing using reverse method of collections class

    public static void main (String [] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(100);
        arrayList.add(25);
        arrayList.add(150);
        arrayList.add(175);
        arrayList.add(75);
        arrayList.add(50);

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println("------------------------------------");

        Collections.reverse(arrayList);
        System.out.println(arrayList);

    }
}
