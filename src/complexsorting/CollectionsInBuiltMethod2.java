package complexsorting;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsInBuiltMethod2 {

    public static void main (String [] args){
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(75);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(125);
        al.add(175);

        System.out.println("The array List is "+al);
        System.out.println("__________________________________________");
        Collections.rotate(al,1);
        System.out.println(al);
        System.out.println("___________________________________________");
        Collections.rotate(al,2);
        System.out.println(al);
        al.add(75);
        al.add(100);
        System.out.println(Collections.frequency(al,75));
        System.out.println("---------------------------------------");
        System.out.println(Collections.frequency(al,100));
        System.out.println(al);
        // Replacing the element
        Collections.replaceAll(al,75,140);
        System.out.println(al);
        System.out.println("--------------------------------");
        // will shuffle the elements inside the array list
        Collections.shuffle(al);
        System.out.println(al);

    }
}
