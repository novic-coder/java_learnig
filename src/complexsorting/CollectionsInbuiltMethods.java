package complexsorting;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsInbuiltMethods {
    // We will see inbuilt method inside Collections class

    public static void main (String [] args){

        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(125);
        al.add(75);
        al.add(175);

        System.out.println("The elements of ArrayList is "+al);

        //Collections.BinarySeatch(arraylist, element) -- it searches the element and gives its index if available
        System.out.println(Collections.binarySearch(al,75));
        System.out.println("-----------------------------");
        System.out.println(Collections.binarySearch(al,175));
        System.out.println("-------------------------------------");
        System.out.println(Collections.binarySearch(al,200));   // if element not present no some random negative number
        System.out.println("_______________________________");
        System.out.println("Minimum inside the array list ");
        System.out.println(Collections.min(al));
        System.out.println("Maximum inside the Array List");
        System.out.println(Collections.max(al));
    }
}
